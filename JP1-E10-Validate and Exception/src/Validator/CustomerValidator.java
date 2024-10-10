package Validator;

import Entity.Customer;
import Exceptions.InvalidCustomerNameException;

public class CustomerValidator {

    public static void validateCustomerName(String customerName) {
        if (!customerName.matches("[\\p{L} ]{3,50}")) {
            throw new InvalidCustomerNameException("Tên khách hàng không đúng định dạng.");
        }
    }

    public static void validate(Customer customer) {
        validateCustomerName(customer.getName());
    }
}

