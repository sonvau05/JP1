import Entity.Account;
import Entity.Customer;
import Entity.Invoice;
import Entity.Gender;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Vinh", Gender.M, 10));
        customers.add(new Customer(2, "Lan", Gender.F, 5));
        customers.add(new Customer(3, "Huong", Gender.F, 7));

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1, customers.get(0), 5500000.0));
        accounts.add(new Account(2, customers.get(1), 600000.0));
        accounts.add(new Account(3, customers.get(2), 400000.0));

        List<Invoice> invoices = new ArrayList<>();
        invoices.add(new Invoice(1, customers.get(0), 200000.0, LocalDateTime.of(2024, 8, 10, 10, 0)));
        invoices.add(new Invoice(2, customers.get(1), 150000.0, LocalDateTime.of(2024, 7, 5, 12, 0)));
        invoices.add(new Invoice(3, customers.get(2), 300000.0, LocalDateTime.of(2024, 8, 20, 14, 0)));

        List<Customer> sortedCustomers = customers.stream()
                .sorted((c1, c2) -> c1.getName().compareTo(c2.getName()))
                .collect(Collectors.toList());
        System.out.println("Sorted Customers by Name: " + sortedCustomers);

        List<Account> sortedAccounts = accounts.stream()
                .sorted((a1, a2) -> a1.getCustomer().getName().compareTo(a2.getCustomer().getName()))
                .collect(Collectors.toList());
        System.out.println("Sorted Accounts by Customer Name: " + sortedAccounts);

        List<Invoice> sortedInvoices = invoices.stream()
                .sorted((i1, i2) -> i1.getCustomer().getName().compareTo(i2.getCustomer().getName()))
                .collect(Collectors.toList());
        System.out.println("Sorted Invoices by Customer Name: " + sortedInvoices);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name to search: ");
        String inputName = scanner.nextLine();

        List<Customer> searchedCustomers = customers.stream()
                .filter(c -> c.getName().equalsIgnoreCase(inputName))
                .collect(Collectors.toList());
        System.out.println("Search Result for Customer: " + searchedCustomers);

        List<Account> searchedAccounts = accounts.stream()
                .filter(a -> a.getCustomer().getName().equalsIgnoreCase(inputName))
                .collect(Collectors.toList());
        System.out.println("Search Result for Accounts: " + searchedAccounts);

        List<Invoice> searchedInvoices = invoices.stream()
                .filter(i -> i.getCustomer().getName().equalsIgnoreCase(inputName))
                .collect(Collectors.toList());
        System.out.println("Search Result for Invoices: " + searchedInvoices);

        List<Invoice> augustInvoices = invoices.stream()
                .filter(i -> i.getDateTime().getMonthValue() == 8 && i.getCustomer().getGender() == Gender.F)
                .collect(Collectors.toList());

        augustInvoices.forEach(i -> {
            double discount = i.getAmount() * 0.1;
            System.out.println("Discounted Invoice for " + i.getCustomer().getName() + ": " + (i.getAmount() - discount));
        });
    }
}



