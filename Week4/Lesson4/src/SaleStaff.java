public class SaleStaff extends Employee {
    private int numbersOfSale;

    public SaleStaff() {
    }

    public SaleStaff(int id, String name, String country, double salary, int numbersOfSale) {
        super(id, name, country, salary);
        this.numbersOfSale = numbersOfSale;
    }

    public int getNumbersOfSale() {
        return numbersOfSale;
    }

    public void setNumbersOfSale(int numbersOfSale) {
        this.numbersOfSale = numbersOfSale;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is selling products. Total sale: " + numbersOfSale);
    }
}
