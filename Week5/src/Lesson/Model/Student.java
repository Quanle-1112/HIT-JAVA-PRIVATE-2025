package Lesson.Model;

public class Student {
    private String name;
    private int age;
    private String CLASS;

    public Student() {
    }

    public Student(String name, int age, String CLASS) {
        this.name = name;
        this.age = age;
        this.CLASS = CLASS;
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

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", CLASS='" + CLASS + '\'' +
                '}';
    }
}
