package Validator;

import Entity.Product;
import Exceptions.InvalidProductIdException;
import Exceptions.InvalidProductNameException;
import Exceptions.InvalidQuantityException;

public class ProductValidator {

    public static void validateProductId(String productId) {
        if (!productId.matches("(MS|NE|SE)[0-9]{6}")) {
            throw new InvalidProductIdException("Mã sản phẩm không đúng định dạng.");
        }
    }

    public static void validateProductName(String productName) {
        if (!productName.matches("[\\p{L} ]+")) {
            throw new InvalidProductNameException("Tên sản phẩm không đúng định dạng.");
        }
    }

    public static void validateProductQuantity(int quantity) {
        if (quantity < 0) {
            throw new InvalidQuantityException("Số lượng tồn kho không hợp lệ.");
        }
    }

    public static void validate(Product product) {
        validateProductId(product.getId());
        validateProductName(product.getName());
        validateProductQuantity(product.getQuantity());
    }
}

