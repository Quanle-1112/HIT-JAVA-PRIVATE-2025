package Lesson1.Model;

public class Lion extends Animal {
    private double weight;

    public Lion() {
    }

    public Lion(double weight) {
        this.weight = weight;
    }

    public Lion(int id, String name, int age, double weight) {
        super(id, name, age);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "weight "+ this.weight + "Gao";
    }
}
