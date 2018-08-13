package app.dao;

import app.model.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Баранов on 27.07.2018.
 */
@Repository
public class OrderDaoImpl implements OrderDao {

    private static final Logger logger = LoggerFactory.getLogger(Order.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addOrders(Order order) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(order);
        logger.info("Order successfully add. Order: "  + order);

    }

    @Override
    public void removeOrders(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Order order = (Order) session.load(Order.class, new Integer(id));

        if (order != null){
            session.delete(order);
            logger.info("Order successfully delete. Order: " + order);
        }else{logger.info("Order not found. Please try later");}


    }

    @Override
    public Order getByOrderId(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Order order = (Order) session.load(Order.class, new Integer(id));
        logger.info("Order successfully loaded. Order: " + order);
        return order;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Order> listOrder() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Order> orderList = session.createQuery("from Order ").list();

        for (Order product: orderList) {
            logger.info("Order list: " + orderList);

        }
        return orderList;
    }
}
