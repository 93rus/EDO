package app.service;

import app.dao.OrderDao;
import app.model.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Баранов on 27.07.2018.
 */
@Service
public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    @Transactional
    public void addOrders(Order order) {
        this.orderDao.addOrders(order);

    }

    @Override
    @Transactional
    public void removeOrders(int id) {
        this.orderDao.removeOrders(id);

    }

    @Override
    @Transactional
    public Order getByOrderId(int id) {
        return this.orderDao.getByOrderId(id);
    }

    @Override
    @Transactional
    public List<Order> listOrder() {
        return this.orderDao.listOrder();
    }
}
