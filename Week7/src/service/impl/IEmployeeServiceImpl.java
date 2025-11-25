package service.impl;

import constant.SuccessMessage;
import model.Employee;
import service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class IEmployeeServiceImpl implements IEmployeeService {
    ArrayList<Employee> employees = new ArrayList<>();
    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeByID(String id) {
        for(Employee employee : employees) {
            if (employee.getId().equals(id)) {
                System.out.println(SuccessMessage.SUCCES_ID_FOUNDED+id);
                return employee;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        for (Employee employee: employees) {
            if (employee.getName().equals(name)) {
                System.out.println(SuccessMessage.SUCCESS_NAME_FOUNDED+name);
                return employees;
            }
        }
        return null;
    }
}
