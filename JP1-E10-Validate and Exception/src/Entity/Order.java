package Entity;

import Enums.OrderStatus;

import java.util.Date;

public class Order {
    private String id;
    private int customerId;
    private Date date;
    private OrderStatus status;

    public Order(String id, int customerId) {
        this.id = id;
        this.customerId = customerId;
        this.date = new Date();
        this.status = OrderStatus.PENDING;
    }

    public String getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getDate() {
        return date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}



