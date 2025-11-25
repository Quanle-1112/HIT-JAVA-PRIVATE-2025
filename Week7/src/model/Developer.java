package model;

import service.IDebuggable;
import service.IWorkable;

public class Developer extends Employee implements IDebuggable, IWorkable {

    private int overtimeHours;

    public Developer() {
    }

    public Developer(String id, String name, int age, double basicSalary, Device device, int overtimeHours) {
        super(id, name, age, basicSalary, device);
        this.overtimeHours = overtimeHours;
    }

    public Developer(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double caculateSalary() {
        return getBasicSalary()+BASE_SALARY_RATE*this.overtimeHours;
    }

    @Override
    public void fixBug() {
        System.out.println("Fixbug work");
    }

    @Override
    public void work() {
        System.out.println("Developer work");
    }
}
