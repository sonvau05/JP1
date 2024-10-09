package Entity;

import Exceptions.InvalidExceptions;

public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        if (name.length() < 3 || name.length() > 50 || !name.matches("[\\p{L}\\s]+")) {
            throw new InvalidExceptions.InvalidCustomerNameException("Tên khách hàng không đúng định dạng.");
        }
        this.id = id;
        this.name = name;
    }

    // Getters và Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

