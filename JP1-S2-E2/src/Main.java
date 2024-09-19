import model.Employee;
import service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1); // toString();

        EmployeeService employeeService = new EmployeeService();
        System.out.println("Annual salary is: " + employeeService.getAnnualSalary(e1));

        System.out.println("New salary after raise: " + employeeService.raiseSalary(e1, 10));
        System.out.println(e1);
    }
}
