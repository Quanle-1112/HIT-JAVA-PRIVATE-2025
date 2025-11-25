import constant.Common;
import constant.SuccessMessage;
import model.Developer;
import model.Device;
import model.Employee;
import service.IEmployeeService;
import service.impl.IEmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class Main {
    public static ArrayList<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IEmployeeService iEmployeeService = new IEmployeeServiceImpl();

        iEmployeeService.getAllEmployees().add(new Developer("1", "Quan",19, 1000, new Device("112","laptop"), 10));
        iEmployeeService.getAllEmployees().add(new Developer("2", "Hoang",20, 3000, new Device("113","mobi"), 11));
        iEmployeeService.getAllEmployees().add(new Developer("3", "Nam",21, 2000, new Device("114","lap"), 12));
        iEmployeeService.getAllEmployees().add(new Developer("4", "Hung",22, 4000, new Device("115","may"), 13));
        iEmployeeService.getAllEmployees().add(new Developer("5", "Anh",23, 5000, new Device("116","dth"), 14));
        int choice;
        do {
            System.out.println(Common.MENU);
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                choice = 0;
            }

            switch (choice) {
                case 1:
                    System.out.println(Common.ENTER_ID_FOUND);
                    int idFound = Integer.parseInt(sc.nextLine());
                    if (iEmployeeService.getEmployeeByID(String.valueOf(idFound)) != null) {
                        Employee foundEmployee = iEmployeeService.getEmployeeByID(String.valueOf(idFound));
                        System.out.println(foundEmployee.toString());
                    } else {
                        System.out.println("Nhap id sai");
                    }
                    break;
                case 2:
                System.out.println(Common.ENTER_EMPLOYEE_NAME);
                String nameFound = sc.nextLine();
                List<Employee> foundEmployees = iEmployeeService.getEmployeeByName(nameFound);
                if (foundEmployees != null && !foundEmployees.isEmpty()) {
                    for (Employee e : foundEmployees) {
                        System.out.println(e);
                    }
                } else {
                    System.out.println("Nhap ten sai");
                }
                break;
                case 3:
                    ArrayList<Employee> emp = (ArrayList<Employee>) iEmployeeService.getAllEmployees();
                    if (emp.isEmpty()) {
                        System.out.println("Danh sach loi: ");
                    } else {
                        for (Employee e : emp) {
                            System.out.println(e.toString());
                        }
                    }
                    break;
                case 4:
                    System.out.print("Da Thoat!");
                    break;
            }
        }   while (choice != 4) ;
    }
}