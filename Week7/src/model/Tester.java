package model;

import service.IWorkable;

public class Tester extends Employee implements IWorkable {
    private int bugsDetectedCount;

    public Tester() {
    }

    public Tester(int bugsDetectedCount) {
        this.bugsDetectedCount = bugsDetectedCount;
    }

    public Tester(String id, String name, int age, double basicSalary, Device device, int bugsDetectedCount) {
        super(id, name, age, basicSalary, device);
        this.bugsDetectedCount = bugsDetectedCount;
    }

    @Override
    public double caculateSalary() {
        return getBasicSalary()+BASE_SALARY_RATE*this.bugsDetectedCount;
    }

    @Override
    public void work() {
        System.out.println("Tester work");

    }
}
