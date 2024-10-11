package Exceptions;

public class InvalidProductNameException extends RuntimeException {
    public InvalidProductNameException(String productName) {
        super("Tên sản phẩm không hợp lệ: " + productName + ". Tên chỉ được chứa chữ cái và dấu cách.");
    }
}



