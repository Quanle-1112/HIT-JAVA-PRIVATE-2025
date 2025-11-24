package Lesson6.model;

public class Bird extends Animal {
    boolean check;
    public Bird() {
    }

    public Bird(String name, String age, boolean check) {
        super(name, age);
        this.check = check;
    }

    @Override
    public void makeSound() {
        System.out.println("Chip chip");
    }

    @Override
    public void eat() {
        System.out.println("eat gao");
    }

    @Override
    public void move() {
        System.out.println("2 canh");
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
