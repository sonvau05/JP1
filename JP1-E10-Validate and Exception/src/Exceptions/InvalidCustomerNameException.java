package Exceptions;

public class InvalidCustomerNameException extends RuntimeException {
    public InvalidCustomerNameException(String customerName) {
        super("Tên khách hàng không hợp lệ: " + customerName + ". Tên chỉ được chứa chữ cái và dấu cách.");
    }
}





