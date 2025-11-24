package Lesson.Service;

import Lesson.Model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public StudentService() {
    }

    public StudentService(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public static void setStudent(Student student) {
        System.out.println("Nhap ten can them: ");
        String name = sc.nextLine();

        System.out.println("Nhap tuoi can them: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap lop can them: ");
        String CLASS = sc.nextLine();
        students.add(new Student(name, age, CLASS));
    }

    public void removeStudent(String name) {
        for (Student x : students) {
            if (x.getName().equalsIgnoreCase(name))
                students.remove(x);
        }
    }

    public Student findByNameStudent(String name) {
        for (Student x : students) {
            if(x.getName().equalsIgnoreCase(name))
                return x;
        }
        return new Student();
    }

    public Student findByClassStudent(String CLASS) {
        for (Student x : students) {
            if (x.getCLASS().equalsIgnoreCase(CLASS))
                return x;
        }
        return new Student();
    }

}
