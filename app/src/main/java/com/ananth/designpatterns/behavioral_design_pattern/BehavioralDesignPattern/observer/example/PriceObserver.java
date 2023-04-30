package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.observer.example;

//Concrete observer
public class PriceObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        //query back observable about intres
     double total = order.getItemCost();
    }
}
