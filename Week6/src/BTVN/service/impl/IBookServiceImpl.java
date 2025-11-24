package BTVN.service.impl;

import BTVN.Main;
import BTVN.constant.ErrorMessage;
import BTVN.exception.InvalidBookException;
import BTVN.model.Book;
import BTVN.service.IBookService;

import java.util.ArrayList;

public class IBookServiceImpl implements IBookService {

    private boolean isValidBookInfo(Book book) {
        return !book.getAuthor().isEmpty() && !book.getTitle().isEmpty() && !(book.getPrice()<=0) && book.getQuantity()>0;
    }

    @Override
    public void addBook(Book book) throws InvalidBookException {
        if (!isValidBookInfo(book)) {
            throw new InvalidBookException(ErrorMessage.ERROR_INVALID_BOOK_INFO);
        }
        Main.books.add(book);

    }

    @Override
    public Book getBook(String id) {
        for (Book book : Main.books) {
            if (book.getId().equals(id)){
                return book;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Book> getAllBooksByCategory(Object category) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : Main.books) {
            boolean b= book.getClass().getSimpleName().equalsIgnoreCase(category);
            if (b) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public void deleteBookById(String id) {
        Book foundedBook = getBookByID(id);
        if (foundedBook != null) {
            Main.books.remove(foundedBook);
            System.out.println();
            return;
        }
        System.out.println(ErrorMessage.ERROR_ID_NOT_FOUND);
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        return Main.books;
    }

    @Override
    public double calculateTotalValue() {
        double totalValue = 0;
        for (Book book : Main.books) {
            totalValue += book.getPrice()*book.getQuantity();
        }
        return totalValue;
    }
}
