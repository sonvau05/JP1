import Controller.AccountController;
import Entity.*;
import Entity.Customer;

import java.util.ArrayList;
import java.util.List;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Son"));
        customers.add(new Customer(2, "Vinh"));
        Account acc = new Account("123456789", 2000, customers.get(0));
        AccountController accountController = new AccountController(acc);
        //Validation amout inout from keyboard and inform to user
        //Must be a number and less than balance.Acc and inform to user
        //Using Regular Expression
        accountController.deposit(1200);
        System.out.println(acc);
        accountController.withdraw(2200);
        System.out.println(acc);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        double amount = scanner.nextDouble();

        accountController.deposit(amount);
        System.out.println(acc);
        accountController.withdraw(amount);
        System.out.println(acc);


    }
}
