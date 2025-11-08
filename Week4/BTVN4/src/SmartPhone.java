public class SmartPhone extends Product{
    private boolean has5G;

    public SmartPhone() {    }

    public SmartPhone(int id, String name, String description, double price, boolean has5G) {
        super(id, name, description, price);
        this.has5G = false;
    }

    public SmartPhone(String name, String description, double price, boolean b) {
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" co ho tro 5G: "+(has5G ? "co":"khong");
    }
}
