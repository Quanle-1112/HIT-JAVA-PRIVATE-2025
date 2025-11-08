package model;

public class SmartPhone extends Product {
    public boolean has5G;

    public SmartPhone() {
    }

    public SmartPhone(boolean has5G) {
        this.has5G = has5G;
    }

    public SmartPhone(String name, String description, double price, boolean has5G) {
        super(name, description, price);
        this.has5G = has5G;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    @Override
    public String getInfo() {
        return "SMARTPHONE" + super.getInfo() + "Ho tro 5G: " + (this.has5G ? "Yes" : "No");
    }
}
