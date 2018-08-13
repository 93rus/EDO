package app.dao;

import app.model.Order;

import java.util.List;

/**
 * Created by Баранов on 27.07.2018.
 */
public interface OrderDao {

    public void addOrders(Order order);

    public void removeOrders(int id);

    public Order getByOrderId(int id);

    public List<Order> listOrder();



}
