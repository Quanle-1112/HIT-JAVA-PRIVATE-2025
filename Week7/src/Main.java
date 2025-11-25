import constant.Common;
import model.Developer;
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
                    int nameFound = Integer.parseInt(sc.nextLine());
                    if (iEmployeeService.getEmployeeByID(String.valueOf(nameFound)) != null) {
                        Employee foundnameEmployee = (Employee) iEmployeeService.getEmployeeByName(String.valueOf(nameFound));
                        System.out.println(foundnameEmployee.toString());
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
            }
        }   while (choice != 3) ;
    }
}