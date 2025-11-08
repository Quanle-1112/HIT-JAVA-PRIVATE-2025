public class Laptop extends Product{
    private String ram;
    private String cpu;

    public Laptop() {    }

    public Laptop(int id, String name, String description, double price, String ram, String cpu) {
        super(id, name, description, price);
        this.ram = ram;
        this.cpu = cpu;
    }

    public Laptop(String name, String description, double price, String ram, String cpu) {
    }

    public Laptop(String name, String description, double price) {
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+", Ram: "+ram+", CPU: "+cpu;
    }
}
