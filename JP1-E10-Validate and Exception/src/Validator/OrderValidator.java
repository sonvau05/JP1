package Validator;

import Exceptions.InvalidOrderIdException;

public class OrderValidator {
    public static void validateOrderId(String id) {
        if (!id.matches("ORDPM[0-9]{8}")) {
            throw new InvalidOrderIdException(id);
        }
    }
}



