import Controller.CustomerController;
import Entity.Account;
import Entity.Customer;
import Entity.Gender;
import Entity.Staff;
import Service.AccountService;
import Service.CustomerService;
import Service.StaffService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        CustomerService cs = new CustomerService(customers);
        CustomerController customerController = new CustomerController(cs);

        customers.add(new Customer(1, "Binh", "VCB001", Gender.M));
        customers.add(new Customer(2, "Minh", "TCB002", Gender.F));
        customers.add(new Customer(3, "Lan", "VCB003", Gender.F));

        // Test CustomerController
        Customer cus = customerController.getById(1);
        if(cus != null) {
            System.out.println(cus);
        }
        else {
            System.out.println("Not found");
        }

        List<Staff> staffs = new ArrayList<>();
        StaffService ss = new StaffService(staffs);

        staffs.add(new Staff(1, LocalDate.of(1998, 5, 20), "Phuong", "STF001"));
        staffs.add(new Staff(2, LocalDate.of(1985, 8, 15), "Thao", "STF002"));

        Staff staff = ss.getById(3);
        if(staff != null) {
            System.out.println(staff);
        }
        else {
            System.out.println("Staff Not found");
        }

        Staff staffByCode = ss.getByCode("STF001");
        if(staffByCode != null) {
            System.out.println(staffByCode);
        }
        else {
            System.out.println("Staff Not found by code");
        }

        List<Staff> staffsByName = ss.getByName("Phuong");
        System.out.println("Staffs with name 'Phuong': " + staffsByName);

        List<Account> accounts = new ArrayList<>();
        AccountService as = new AccountService(accounts);

        accounts.add(new Account(1, customers.get(0), LocalDateTime.now(), 5500000.0, "ACC001"));
        accounts.add(new Account(2, customers.get(1), LocalDateTime.now(), 600000.0, "ACC002"));
        accounts.add(new Account(3, customers.get(2), LocalDateTime.now(), 400000.0, "ACC003"));
        accounts.add(new Account(4, customers.get(1), LocalDateTime.now(), 200000.0, "ACC004"));
        
        Account accByCode = as.getAccountByCustomerCode("VCB001");
        if(accByCode != null) {
            System.out.println(accByCode);
        }
        else {
            System.out.println("Account Not found by customer code");
        }

        List<Account> accsByName = as.getAccountByCustomerName("Minh");
        System.out.println("Accounts with customer name 'Minh': " + accsByName);

        List<Account> maleAccounts = as.getAccountsByMaleWithBalanceGreaterThan(2000000.0);
        System.out.println("Male Accounts with balance > 2,000,000: " + maleAccounts);

        long femaleCount = as.countFemaleWithBalanceGreaterThan(300000.0);
        System.out.println("Number of Female Customers with balance > 300,000: " + femaleCount);

        Account maxBalanceFemale = as.getAccountWithMaxBalanceForFemale();
        System.out.println("Female Account with max balance: " + maxBalanceFemale);
    }
}

