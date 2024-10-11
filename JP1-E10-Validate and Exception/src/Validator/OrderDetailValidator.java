package Validator;

import Exceptions.InvalidQuantityException;

public class OrderDetailValidator {
    public static void validateQuantity(int quantity) {
        if (quantity <= 0) {
            throw new InvalidQuantityException("Số lượng phải lớn hơn 0.");
        }
    }
}


