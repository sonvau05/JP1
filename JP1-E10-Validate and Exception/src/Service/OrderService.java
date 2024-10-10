package Service;

import Entity.Order;
import Enums.OrderStatus;
import Validator.OrderValidator;
import java.util.HashMap;
import java.util.Map;

public class OrderService {
    private Map<String, Order> orderMap = new HashMap<>();

    public void addOrder(Order order) {
        OrderValidator.validate(order);
        if (orderMap.containsKey(order.getId())) {
            throw new IllegalArgumentException("Đơn hàng đã tồn tại.");
        }
        orderMap.put(order.getId(), order);
    }

    public Order findOrderById(String id) {
        return orderMap.get(id);
    }

    public void updateOrderStatus(String id, OrderStatus status) {
        Order order = findOrderById(id);
        order.setStatus(status);
    }
}

