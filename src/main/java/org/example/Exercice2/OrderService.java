package org.example.Exercice2;

public class OrderService {
    private OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
    public boolean createOrder(Order order) {
        orderDao.saveOrder(order);
        return true;
    }
}

