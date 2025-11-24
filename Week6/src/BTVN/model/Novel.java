package BTVN.model;

public class Novel extends Book{
    private String genre;

    public Novel() {
    }

    public Novel(String id, String title, String author, double price, int quantity, String genre) {
        super(id, title, author, price, quantity);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The loai: " + this.genre + "\n");
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
