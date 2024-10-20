import Controller.AccountController;
import Controller.CustomerController;
import Controller.InvoiceController;
import Entity.Customer;
import Entity.Account;
import Entity.Invoice;
import Entity.Gender;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "Lisa", Gender.F, 10),
                new Customer(2, "Berbatov", Gender.M, 5)
        );

        List<Account> accounts = Arrays.asList(
                new Account(1, customers.get(0), 1000.00),
                new Account(2, customers.get(1), 500.00)
        );

        List<Invoice> invoices = Arrays.asList(
                new Invoice(1, customers.get(0), 200.00, LocalDateTime.now()),
                new Invoice(2, customers.get(1), 300.00, LocalDateTime.now())
        );

        CustomerController customerController = new CustomerController();
        AccountController accountController = new AccountController();
        InvoiceController invoiceController = new InvoiceController();

        System.out.println("Danh sách khách hàng:");
        List<Customer> sortedCustomers = customerController.sortByName(customers);
        sortedCustomers.forEach(System.out::println);

        System.out.println("\nTài khoản có số dư đủ thanh toán hóa đơn:");
        List<Account> sufficientAccounts = accountController.getSufficientBalance(accounts, invoices);
        sufficientAccounts.forEach(System.out::println);

        System.out.println("\nHóa đơn đã được giảm giá cho khách hàng nữ trong tháng 8:");
        List<Invoice> discountedInvoices = invoiceController.applyDiscountForWomen(invoices);
        discountedInvoices.forEach(System.out::println);
    }
}
