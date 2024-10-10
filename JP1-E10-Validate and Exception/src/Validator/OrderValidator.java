package Validator;

import Entity.Order;
import Exceptions.InvalidOrderIdException;

public class OrderValidator {

    public static void validateOrderId(String orderId) {
        if (!orderId.matches("(ORDPM)[0-9]{8}")) {
            throw new InvalidOrderIdException("Mã đơn hàng không đúng định dạng.");
        }
    }

    public static void validate(Order order) {
        validateOrderId(order.getId());
    }
}

