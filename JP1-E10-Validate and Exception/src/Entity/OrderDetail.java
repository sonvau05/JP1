package Entity;

import Enums.OrderStatus;
import Exceptions.InvalidQuantityException;

public class OrderDetail {
    private int id;
    private String orderId;
    private String productId;
    private int quantity;
    private OrderStatus status;

    public OrderDetail(int id, String orderId, String productId, int quantity) {
        setId(id);
        this.orderId = orderId;
        this.productId = productId;
        setQuantity(quantity);
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

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new InvalidQuantityException("Số lượng không hợp lệ: " + quantity);
        }
        this.quantity = quantity;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}





