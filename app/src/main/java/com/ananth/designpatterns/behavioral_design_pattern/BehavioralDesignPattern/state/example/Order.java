package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.state.example;

//Context class
public class Order {
    OrderState orderState;

    public Order() {
        orderState = new New();
    }

    public double cancel() {
        double charges = orderState.handleCancellation();
        orderState = new Canceled();
        return 0;
    }

    public void paymentSuccessful() {
        orderState = new Paid();
    }

    public void dispatched() {
        orderState = new InTransit();
    }

    public void delivered() {
        orderState = new Delivered();
    }
}
