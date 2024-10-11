package Validator;

import Exceptions.InvalidCustomerNameException;

public class CustomerValidator {
    public static void validateCustomerName(String name) {
        if (!name.matches("[a-zA-Z ]{3,50}")) {
            throw new InvalidCustomerNameException(name);
        }
    }
}




