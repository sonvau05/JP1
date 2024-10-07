import Entity.Account;
import Entity.Customer;
import Entity.Invoice;
import Entity.Gender;
import Service.CustomerService;
import Service.AccountService;
import Service.InvoiceService;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        Customer c1 = new Customer(1, "Alice", Gender.F, 10);
        Customer c2 = new Customer(2, "Bob", Gender.M, 5);
        customers.add(c1);
        customers.add(c2);

        Account acc1 = new Account(1, c1);
        Account acc2 = new Account(2, c2);
        acc1.deposit(1000);
        acc2.deposit(500);

        List<Account> accounts = new ArrayList<>();
        accounts.add(acc1);
        accounts.add(acc2);

        Invoice inv1 = new Invoice(1, c1, 200, LocalDateTime.now());
        Invoice inv2 = new Invoice(2, c2, 300, LocalDateTime.now());
        List<Invoice> invoices = new ArrayList<>();
        invoices.add(inv1);
        invoices.add(inv2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(inv1);
        System.out.println(inv2);

        CustomerService cs = new CustomerService();
        cs.sort(customers);
        System.out.println("Customers after sorting by name:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        Customer foundCustomer = cs.findByName(customers, "Alice");
        if (foundCustomer != null) {
            System.out.println("Found customer: " + foundCustomer);
        } else {
            System.out.println("Customer not found");
        }

        // Liệt kê khách hàng đủ số dư thanh toán hóa đơn
        cs.listEnough(customers, accounts, invoices);

        // Liệt kê khách hàng không đủ số dư thanh toán hóa đơn
        cs.listNotEnough(customers, accounts, invoices);

        // Áp dụng giảm giá thêm 10% cho khách hàng nữ trong tháng 8
        cs.applyDiscount(invoices);
    }
}




