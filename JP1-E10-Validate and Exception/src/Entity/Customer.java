package Entity;

import Exceptions.InvalidCustomerNameException;

public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        setId(id);
        setName(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        if (!name.matches("[a-zA-Z ]{3,50}")) {
            throw new InvalidCustomerNameException(name);
        }
        this.name = name;
    }
}





