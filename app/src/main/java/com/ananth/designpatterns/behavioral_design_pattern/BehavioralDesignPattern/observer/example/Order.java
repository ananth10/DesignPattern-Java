package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.observer.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private double shippingCost;
    //cost of items
    private double itemCost;
    private double discount;
    //no of items
    private int count;

    private List<OrderObserver> observerList = new ArrayList<>();

    public Order(String id) {
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        observerList.add(observer);
    }

    public void detach(OrderObserver observer) {
        observerList.remove(observer);
    }

    public double getTotal() {
        return itemCost - discount + shippingCost;
    }

    public void addItem(double price) {
        itemCost += price;
        count++;
        observerList.forEach(order -> order.updated(this));
    }

    public int getCount() {
        return count;
    }

    public void setShippingCost(double cost) {
        this.shippingCost = cost;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getItemCost() {
        return itemCost;
    }

    @Override
    public String toString() {

        return "Order#" + id + "\nItem cost:" + itemCost + "\nNo. of items:" + count
                + "\nShipping cost:" + shippingCost + "\nDiscount:" + discount
                + "\nTotal:" + getTotal();
    }
}
