package Service;

import Entity.Order;
import Exceptions.NotFoundOrderIdException;
import IGeneric.IGenericService;

import java.util.ArrayList;
import java.util.List;

public class OrderService implements IGenericService<Order> {
    private List<Order> orders = new ArrayList<>();

    @Override
    public void add(Order order) {
        orders.add(order);
    }

    @Override
    public Order getById(int id) {
        if (id < 0 || id >= orders.size()) {
            throw new NotFoundOrderIdException(String.valueOf(id));
        }
        return orders.get(id);
    }

    @Override
    public List<Order> getAll() {
        return orders;
    }

    @Override
    public void update(Order order) {
        // Update logic
    }

    @Override
    public void deleteById(int id) {
        // Delete logic
    }
}




