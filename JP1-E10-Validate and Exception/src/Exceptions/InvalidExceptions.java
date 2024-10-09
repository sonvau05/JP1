package Exceptions;

public class InvalidExceptions {
  public static class InvalidProductIdException extends RuntimeException {
    public InvalidProductIdException(String message) {
      super(message);
    }
  }

  public static class InvalidProductNameException extends RuntimeException {
    public InvalidProductNameException(String message) {
      super(message);
    }
  }

  public static class InvalidQuantityException extends RuntimeException {
    public InvalidQuantityException(String message) {
      super(message);
    }
  }

  public static class InvalidCustomerNameException extends RuntimeException {
    public InvalidCustomerNameException(String message) {
      super(message);
    }
  }

  public static class InvalidOrderIdException extends RuntimeException {
    public InvalidOrderIdException(String message) {
      super(message);
    }
  }
}
