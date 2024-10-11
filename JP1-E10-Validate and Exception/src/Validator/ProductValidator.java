package Validator;

import Exceptions.InvalidProductIdException;
import Exceptions.InvalidProductNameException;

public class ProductValidator {
    public static void validateProductId(String id) {
        if (!id.matches("(MS|NE|SE)[0-9]{6}")) {
            throw new InvalidProductIdException("Mã sản phẩm không hợp lệ: " + id);
        }
    }

    public static void validateProductName(String name) {
        if (!name.matches("[a-zA-Z ]+")) {
            throw new InvalidProductNameException(name);
        }
    }
}





