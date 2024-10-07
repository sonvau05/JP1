package Service;

import Entity.Customer;
import Entity.Account;
import Entity.Invoice;
import Entity.Gender;
import IGeneric.IGenaric;

import java.util.Comparator;
import java.util.List;

public class CustomerService implements IGenaric<Customer> {

    @Override
    public void update(Customer customer) {
    }

    @Override
    public void sort(List<Customer> customers) {
        customers.sort(Comparator.comparing(Customer::getName));
    }

    @Override
    public Customer findById(List<Customer> customers, int id) {
        return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Customer findByName(List<Customer> customers, String name) {
        return customers.stream()
                .filter(customer -> customer.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public void listEnough(List<Customer> customers, List<Account> accounts, List<Invoice> invoices) {
        for (Invoice invoice : invoices) {
            double discountedAmount = invoice.getAmount() * (1 - invoice.getCustomer().getDiscount() / 100.0);
            for (Account account : accounts) {
                if (account.getCustomer().getId() == invoice.getCustomer().getId() && account.getBalance() >= discountedAmount) {
                    System.out.println(invoice.getCustomer() + " has enough balance for the invoice.");
                }
            }
        }
    }

    public void listNotEnough(List<Customer> customers, List<Account> accounts, List<Invoice> invoices) {
        for (Invoice invoice : invoices) {
            for (Account account : accounts) {
                if (account.getCustomer().getId() == invoice.getCustomer().getId() && account.getBalance() < invoice.getAmount()) {
                    System.out.println(invoice.getCustomer() + " does not have enough balance for the invoice.");
                }
            }
        }
    }

    public void applyDiscount(List<Invoice> invoices) {
        for (Invoice invoice : invoices) {
            if (invoice.getCustomer().getGender() == Gender.F && invoice.getDateTime().getMonthValue() == 8) {
                int currentDiscount = invoice.getCustomer().getDiscount();
                invoice.getCustomer().setDiscount(currentDiscount + 10);  // Thêm 10% discount
            }
        }
    }
}






