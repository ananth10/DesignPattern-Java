package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.strategy.example;


import java.util.LinkedList;

//context/object
public class PrintService {

    OrderPrinter orderPrinter;

    public PrintService(OrderPrinter printer) {
        this.orderPrinter = printer;
    }

    public void printOrders(LinkedList<Order> orders) {
        orderPrinter.print(orders);
    }
}
