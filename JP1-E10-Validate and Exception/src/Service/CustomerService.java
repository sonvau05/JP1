package Service;

import Entity.Customer;
import Validator.CustomerValidator;
import java.util.HashMap;
import java.util.Map;

public class CustomerService {
    private Map<Integer, Customer> customerMap = new HashMap<>();

    public void addCustomer(Customer customer) {
        CustomerValidator.validate(customer);
        if (customerMap.containsKey(customer.getId())) {
            throw new IllegalArgumentException("Khách hàng đã tồn tại.");
        }
        customerMap.put(customer.getId(), customer);
    }

    public Customer findCustomerById(int id) {
        return customerMap.get(id);
    }
}

