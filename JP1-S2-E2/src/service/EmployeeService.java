package service;

import model.Employee;
import util.SalaryUtil;

public class EmployeeService {

    public int getAnnualSalary(Employee employee) {
        return SalaryUtil.calculateAnnualSalary(employee.getSalary());
    }

    public int raiseSalary(Employee employee, int percent) {
        int newSalary = SalaryUtil.calculateRaisedSalary(employee.getSalary(), percent);
        employee.setSalary(newSalary);
        return newSalary;
    }
}
