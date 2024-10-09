package Entity;

import Exceptions.InvalidExceptions;

public class OrderDetail {
    private int id;
    private String orderId;
    private String productId;
    private int quantity;

    public OrderDetail(int id, String orderId, String productId, int quantity) {
        if (quantity <= 0) {
            throw new InvalidExceptions.InvalidQuantityException("Số lượng bán ra không hợp lệ.");
        }
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}

