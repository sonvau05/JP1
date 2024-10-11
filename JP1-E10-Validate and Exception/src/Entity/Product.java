package Entity;

import Exceptions.InvalidProductIdException;
import Exceptions.InvalidProductNameException;

public class Product {
    private String id;
    private String name;
    private int quantity;

    public Product(String id, String name, int quantity) {
        setId(id);
        setName(name);
        setQuantity(quantity);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        if (!id.matches("(MS|NE|SE)[0-9]{6}")) {
            throw new InvalidProductIdException("Mã sản phẩm không hợp lệ: " + id);
        }
        this.id = id;
    }

    public void setName(String name) {
        if (!name.matches("[a-zA-Z ]+")) {
            throw new InvalidProductNameException(name);
        }
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}







