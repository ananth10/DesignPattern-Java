package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.observer.example;

//Concrete observer
public class PriceObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        //query back observable about price
        double total = order.getItemCost();
        if (total > 500) {
            order.setDiscount(20);
        } else if (total > 200) {
            order.setDiscount(10);
        }
    }
}
