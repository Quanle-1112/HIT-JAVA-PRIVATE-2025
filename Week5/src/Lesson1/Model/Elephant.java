package Lesson1.Model;

public class Elephant extends Animal {
    private double trunkLength;

    public Elephant() {
    }

    public Elephant(double trunkLength) {
        this.trunkLength = trunkLength;
    }

    public Elephant(int id, String name, int age, double trunkLength) {
        super(id, name, age);
        this.trunkLength = trunkLength;
    }

    public double getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(double trunkLength) {
        this.trunkLength = trunkLength;
    }

    @Override
    public String toString() {
        return super.toString() + "trunkElephant: " + this.trunkLength + "U o o";
    }
}
