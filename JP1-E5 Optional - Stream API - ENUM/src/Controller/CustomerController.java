package Controller;

import Entity.Customer;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerController {
    public List<Customer> sortByName(List<Customer> customers) {
        Collections.sort(customers, Comparator.comparing(Customer::getName));
        return customers;
    }
}
