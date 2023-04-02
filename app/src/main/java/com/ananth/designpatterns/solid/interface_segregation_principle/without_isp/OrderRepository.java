package com.ananth.designpatterns.solid.interface_segregation_principle.without_isp;

import java.util.HashMap;
import java.util.List;

import kotlin.jvm.Throws;

public class OrderRepository implements IRepository<Order> {

    private static final HashMap<Long, Order> orders = new HashMap<>();

    @Override
    public void save(Order entity) {
        synchronized (orders) {
            orders.put(entity.getId(), entity);
        }
    }

    @Override
    public void delete(Order entity) {
        synchronized (orders) {
            orders.remove(entity.getId());
        }
    }

    @Override
    public Order findById(Long id) {
        synchronized (orders) {
            return null;
        }
    }

    /**
     * This findByName violates Interface Segregation Principle, because for order repository we really do not need this method
    * */
    @Override
    public List<Order> findByName(String name) {
        synchronized (orders) {
            throw new UnsupportedOperationException("findByName is not support here");  //we are throwing exception here, so violation of ISP
        }
    }
}
