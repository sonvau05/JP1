package Exceptions;

public class NotFoundProductIdException extends RuntimeException {
    public NotFoundProductIdException(String productId) {
        super("Không tìm thấy ID sản phẩm: " + productId + ".");
    }
}
