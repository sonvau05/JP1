package Service;

import Entity.Customer;
import Exceptions.NotFoundCustomerIdException;
import IGeneric.IGenericService;
import Validator.CustomerValidator;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements IGenericService<Customer> {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        CustomerValidator.validateCustomerName(customer.getName());
        customers.add(customer);
    }

    @Override
    public Customer getById(int id) {
        if (id < 0 || id >= customers.size()) {
            throw new NotFoundCustomerIdException(String.valueOf(id));
        }
        return customers.get(id);
    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public void update(Customer customer) {
    }

    @Override
    public void deleteById(int id) {
    }
}



