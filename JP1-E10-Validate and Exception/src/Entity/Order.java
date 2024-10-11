package Entity;

import Exceptions.InvalidOrderIdException;

import java.util.Date;

public class Order {
    private String id;
    private int customerId;
    private Date datetime;

    public Order(String id, int customerId) {
        setId(id);
        this.customerId = customerId;
        this.datetime = new Date();
    }

    public String getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setId(String id) {
        if (!id.matches("ORDPM[0-9]{8}")) {
            throw new InvalidOrderIdException(id);
        }
        this.id = id;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}





