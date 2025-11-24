package Lesson6.model;

import Lesson6.service.Flyable;
import Lesson6.service.Swimmable;

public abstract class Animal implements Swimmable, Flyable {
    protected String name;
    protected String age;

    public Animal() {
    }

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }



    public abstract void makeSound();

    public abstract void eat();

    public abstract void move();

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean swim() {
        return false;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
