package Entity;

import Exceptions.InvalidExceptions;

import java.time.LocalDateTime;

public class Order {
    private String id;
    private int customerId;
    private LocalDateTime dateTime;

    public Order(String id, int customerId) {
        if (!id.matches("ORDPM[0-9]{8}")) {
            throw new InvalidExceptions.InvalidOrderIdException("Mã đơn hàng không đúng định dạng.");
        }
        this.id = id;
        this.customerId = customerId;
        this.dateTime = LocalDateTime.now();
    }

    // Getters
    public String getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}

