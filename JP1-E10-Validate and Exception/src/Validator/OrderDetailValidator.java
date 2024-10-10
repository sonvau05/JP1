package Validator;

import Entity.OrderDetail;
import Exceptions.InvalidQuantityException;

public class OrderDetailValidator {

    public static void validateOrderDetailQuantity(int quantity) {
        if (quantity <= 0) {
            throw new InvalidQuantityException("Số lượng bán ra không hợp lệ.");
        }
    }

    public static void validate(OrderDetail orderDetail) {
        validateOrderDetailQuantity(orderDetail.getQuantity());
    }
}

