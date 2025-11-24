package Lesson6.model;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, String age, boolean check) {
        super(name, age);
        this.check = check;
    }

    boolean check;

    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }

    @Override
    public void eat() {
        System.out.println("Eating fish");
    }

    @Override
    public void move() {
        System.out.println("4 chan");
    }

    @Override
    public boolean fly() {
        return check;
    }

    @Override
    public boolean swim() {
        return check;
    }
}
