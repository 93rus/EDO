package app.service;

import app.model.Order;

import java.util.List;

/**
 * Created by Баранов on 27.07.2018.
 */
public interface OrderService {

    public void addOrders(Order order);

    public void removeOrders(int id);

    public Order getByOrderId(int id);

    public List<Order> listOrder();
}
