package com.ananth.designpatterns.solid.interface_segregation_principle.with_isp;

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

}
