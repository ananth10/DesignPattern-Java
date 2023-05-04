package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.strategy.example;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.LinkedList;

public class Client {
    private static LinkedList<Order> orders = new LinkedList<>();

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args){
        createOrders();
        //print all orders
//        PrintService service = new PrintService(new SummaryPrinter());
        PrintService service = new PrintService(new DetailPrinter());
        service.printOrders(orders);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private static void createOrders() {
        Order o = new Order("100");
        o.addItem("Soda", 2);
        o.addItem("Chips", 10);
        orders.add(o);

        o = new Order("200");
        o.addItem("Cake", 20);
        o.addItem("Cookies", 5);
        orders.add(o);

        o = new Order("300");
        o.addItem("Burger", 8);
        o.addItem("Fries", 5);
        orders.add(o);
    }
}
