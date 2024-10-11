package Exceptions;

public class InvalidOrderIdException extends RuntimeException {
    public InvalidOrderIdException(String orderId) {
        super("Mã đơn hàng không hợp lệ: " + orderId + ". Mã đơn hàng phải theo định dạng ORDPM[0-9]{8}.");
    }
}



