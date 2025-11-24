package Lesson1.Model;

import java.util.UUID;

public class Animal {
    private int id;
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(int id, String name, int age) {
        this.id = UUID.randomUUID().hashCode();
        this.name = name;
        this.age = age;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String showInfo() {
        return "Animal" + this.id + " " + this.name + " " + this.age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
