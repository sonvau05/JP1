package Service;

import Entity.OrderDetail;
import IGeneric.IGenericService;
import Validator.OrderDetailValidator;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailService implements IGenericService<OrderDetail> {
    private List<OrderDetail> orderDetails = new ArrayList<>();

    @Override
    public void add(OrderDetail orderDetail) {
        OrderDetailValidator.validateQuantity(orderDetail.getQuantity());
        orderDetails.add(orderDetail);
    }

    @Override
    public OrderDetail getById(int id) {
        return null;
    }

    @Override
    public List<OrderDetail> getAll() {
        return orderDetails;
    }

    @Override
    public void update(OrderDetail orderDetail) {
    }

    @Override
    public void deleteById(int id) {
    }
}



