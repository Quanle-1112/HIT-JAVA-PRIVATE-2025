package Lesson6.model;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }

    @Override
    public void eat() {
        System.out.println("Eating xuong");
    }

    @Override
    public void move() {
        System.out.println("Biet boi");
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
