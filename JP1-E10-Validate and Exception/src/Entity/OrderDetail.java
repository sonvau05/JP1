package Entity;

import Enums.OrderStatus;

public class OrderDetail {
    private int id;
    private String orderId;
    private String productId;
    private int quantity;
    private OrderStatus status;

    public OrderDetail(int id, String orderId, String productId, int quantity) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.status = OrderStatus.PENDING;
    }

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

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}



