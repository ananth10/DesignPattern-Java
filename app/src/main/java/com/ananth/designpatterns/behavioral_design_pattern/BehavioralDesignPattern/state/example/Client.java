package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.state.example;

public class Client {

    public static void main(String[] args){
     Order order = new Order();
     order.dispatched();
     order.paymentSuccessful();
     order.delivered();
     order.cancel();
    }
}
