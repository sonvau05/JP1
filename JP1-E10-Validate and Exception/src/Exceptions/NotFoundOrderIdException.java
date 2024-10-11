package Exceptions;

public class NotFoundOrderIdException extends RuntimeException {
    public NotFoundOrderIdException(String orderId) {
        super("Không tìm thấy ID đơn hàng: " + orderId + ".");
    }
}

