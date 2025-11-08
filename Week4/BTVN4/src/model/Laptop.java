package model;

public class Laptop extends Product{
    public String ram;
    public String cpu;

    public Laptop() {
    }

    public Laptop(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    public Laptop(String name, String description, double price, String ram, String cpu) {
        super(name, description, price);
        this.ram = ram;
        this.cpu = cpu;
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
        return "LAPTOP" + super.getInfo() + "RAM: " + this.ram + "\nCPU: " + this.cpu;
    }
}
