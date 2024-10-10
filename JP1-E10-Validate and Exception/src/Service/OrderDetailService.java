package Service;

import Entity.OrderDetail;
import Enums.OrderStatus;
import Validator.OrderDetailValidator;
import java.util.HashMap;
import java.util.Map;

public class OrderDetailService {
    private Map<Integer, OrderDetail> orderDetailMap = new HashMap<>();

    public void addOrderDetail(OrderDetail orderDetail) {
        OrderDetailValidator.validate(orderDetail);
        if (orderDetailMap.containsKey(orderDetail.getId())) {
            throw new IllegalArgumentException("Chi tiết đơn hàng đã tồn tại.");
        }
        orderDetailMap.put(orderDetail.getId(), orderDetail);
    }

    public OrderDetail findOrderDetailById(int id) {
        return orderDetailMap.get(id);
    }

    public void updateOrderDetailStatus(int id, OrderStatus status) {
        OrderDetail orderDetail = findOrderDetailById(id);
        orderDetail.setStatus(status);
    }
}

