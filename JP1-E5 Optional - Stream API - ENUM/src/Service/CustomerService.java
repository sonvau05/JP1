package Service;

import Entity.Customer;
import java.util.List;

public class CustomerService {
    public List<Customer> getAllCustomers(List<Customer> customers) {
        return customers;
    }

    public Customer getCustomerById(List<Customer> customers, int id) {
        return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void updateCustomerDiscount(List<Customer> customers, int customerId, int newDiscount) {
        Customer customer = getCustomerById(customers, customerId);
        if (customer != null) {
            customer.setDiscount(newDiscount);
        }
    }
}
