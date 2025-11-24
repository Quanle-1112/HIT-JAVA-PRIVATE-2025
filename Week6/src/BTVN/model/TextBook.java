package BTVN.model;

public class TextBook extends Book{
    private String subject;

    public TextBook() {
    }

    public TextBook(String id, String title, String author, double price, int quantity, String subject) {
        super(id, title, author, price, quantity);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mon hoc: " + this.subject + "\n");
    }

    @Override
    public boolean borrow(int quantity) {
        return false;
    }

    @Override
    public int getAvailableQuantity() {
        return 0;
    }
}
