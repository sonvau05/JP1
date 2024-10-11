package Exceptions;

public class NotFoundCustomerIdException extends RuntimeException {
  public NotFoundCustomerIdException(String customerId) {
    super("Không tìm thấy ID khách hàng: " + customerId + ".");
  }
}


