package Controller;

import Entity.Customer;
import Service.CustomerService;

import java.util.List;

public class CustomerController {
    private CustomerService cs;

    public CustomerController(CustomerService cs) {
        this.cs = cs;
    }

    public Customer getById(int id) {
        return cs.getById(id);
    }

    public Customer getByCode(String code) {
        return cs.getByCode(code);
    }

    public List<Customer> getByName(String keyword) {
        return cs.getByName(keyword);
    }
}

