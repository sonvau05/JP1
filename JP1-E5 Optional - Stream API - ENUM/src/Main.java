import Entity.Account;
import Entity.Customer;
import Entity.Gender;
import Entity.Invoice;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách Customer
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "John Cena", Gender.Male, 10));
        customers.add(new Customer(2, "Marry Jane", Gender.Female, 15));
        customers.add(new Customer(3, "Nikodo", Gender.Other, 20));

        // Tạo danh sách Account
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1, customers.get(0), 100.00));
        accounts.add(new Account(2, customers.get(1), 200.00));
        accounts.add(new Account(3, customers.get(2), 50.00));

        // Tạo danh sách Invoice
        List<Invoice> invoices = new ArrayList<>();
        invoices.add(new Invoice(1, customers.get(0), 120.00, LocalDateTime.of(2024, Month.AUGUST, 10, 0, 0)));
        invoices.add(new Invoice(2, customers.get(1), 180.00, LocalDateTime.of(2024, Month.AUGUST, 15, 0, 0)));
        invoices.add(new Invoice(3, customers.get(2), 60.00, LocalDateTime.of(2024, Month.SEPTEMBER, 5, 0, 0)));

        // a. Sắp xếp Customer theo tên
        customers.sort(Comparator.comparing(Customer::getName));

        // Sắp xếp Account theo balance
        accounts.sort(Comparator.comparing(Account::getBalance));

        // Sắp xếp Invoice theo số tiền cần thanh toán (amount)
        invoices.sort(Comparator.comparing(Invoice::getAmount));

        // c. Tìm kiếm thông tin Account, Invoice theo id | name nhập vào từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập id hoặc tên để tìm kiếm Account: ");
        String input = scanner.nextLine();
        String finalInput = input;
        accounts.stream()
                .filter(acc -> String.valueOf(acc.getId()).equals(finalInput) || acc.getCustomer().getName().equalsIgnoreCase(finalInput))
                .forEach(System.out::println);

        System.out.print("Nhập id hoặc tên để tìm kiếm Invoice: ");
        input = scanner.nextLine();
        String finalInput1 = input;
        invoices.stream()
                .filter(inv -> String.valueOf(inv.getId()).equals(finalInput1) || inv.getCustomer().getName().equalsIgnoreCase(finalInput1))
                .forEach(System.out::println);

        // d. Liệt kê thông tin khách hàng có đủ số dư thanh toán hóa đơn
        System.out.println("Khách hàng đủ số dư thanh toán hóa đơn:");
        customers.stream()
                .filter(customer -> {
                    Account account = accounts.stream()
                            .filter(acc -> acc.getCustomer().equals(customer))
                            .findFirst()
                            .orElse(null);
                    Invoice invoice = invoices.stream()
                            .filter(inv -> inv.getCustomer().equals(customer))
                            .findFirst()
                            .orElse(null);

                    if (account != null && invoice != null) {
                        double discountedAmount = invoice.getAmount() * (1 - customer.getDiscount() / 100.0);
                        return account.getBalance() >= discountedAmount;
                    }
                    return false;
                })
                .forEach(customer -> System.out.println(customer.toString()));

        // e. Liệt kê thông tin khách hàng không đủ số dư để thanh toán hóa đơn chưa bao gồm %discount
        System.out.println("Khách hàng không đủ số dư thanh toán hóa đơn:");
        customers.stream()
                .filter(customer -> {
                    Account account = accounts.stream()
                            .filter(acc -> acc.getCustomer().equals(customer))
                            .findFirst()
                            .orElse(null);
                    Invoice invoice = invoices.stream()
                            .filter(inv -> inv.getCustomer().equals(customer))
                            .findFirst()
                            .orElse(null);

                    if (account != null && invoice != null) {
                        return account.getBalance() < invoice.getAmount(); // Không bao gồm discount
                    }
                    return false;
                })
                .forEach(customer -> System.out.println(customer.toString()));

        // f. Giảm giá thêm 10% cho gender = 'Female' với các hóa đơn được lập trong tháng 8
        System.out.println("Giảm giá thêm 10% cho khách hàng Female có hóa đơn trong tháng 8:");
        invoices.stream()
                .filter(invoice -> invoice.getCustomer().getGender() == Gender.Female &&
                        invoice.getDateTime().getMonth() == Month.AUGUST)
                .forEach(invoice -> {
                    double newDiscount = invoice.getCustomer().getDiscount() + 10;
                    invoice.getCustomer().setDiscount((int) newDiscount);
                    System.out.println("Invoice updated: " + invoice);
                });

        scanner.close();
    }
}


