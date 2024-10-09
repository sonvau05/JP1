package Entity;

import Exceptions.InvalidExceptions;

public class Product {
    private String id;
    private String name;
    private int quantity; // Số lượng tồn kho

    public Product(String id, String name, int quantity) {
        if (!id.matches("(MS|NE|SE)[0-9]{6}")) {
            throw new InvalidExceptions.InvalidProductIdException("Mã sản phẩm không đúng định dạng.");
        }
        if (!name.matches("[\\p{L}\\s]+")) {
            throw new InvalidExceptions.InvalidProductNameException("Tên sản phẩm không đúng định dạng.");
        }
        if (quantity < 0) {
            throw new InvalidExceptions.InvalidQuantityException("Số lượng không thể âm.");
        }
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    // Getters và Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

