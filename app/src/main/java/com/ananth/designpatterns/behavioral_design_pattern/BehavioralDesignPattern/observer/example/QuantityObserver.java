package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.observer.example;

//Concrete observer
public class QuantityObserver implements OrderObserver {
    @Override
    public void updated(Order order) {
        int orderCount = order.getCount();
        if (orderCount <= 5) {
            order.setShippingCost(10);
        } else {
            order.setShippingCost(10 + (orderCount - 5) * 1.5);
        }
    }
}
