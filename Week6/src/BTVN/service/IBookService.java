package BTVN.service;

import BTVN.model.Book;

import java.util.ArrayList;

public interface IBookService {
    public void addBook(Book book);
    public Book getBook(String id);
    public ArrayList<Book> getAllBooksByCategory(Object category);
    public void deleteBookById(String id);
    public ArrayList<Book> getAllBooks();
    public double calculateTotalValue();


}
