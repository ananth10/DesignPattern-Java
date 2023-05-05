package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.template_method.example;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.IOException;

public class Client {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args) throws IOException {
        Order order = new Order("101");
        order.addItem("Soda", 2.50);
        order.addItem("Banana", 1.50);
        order.addItem("Chicken Burger", 5.50);

        OrderPrinter printer = new TextPrinter();
        OrderPrinter printer1 = new HtmlPrinter();
        printer.printOrder(order, "my_order.txt");
        printer1.printOrder(order, "my_order.html");
    }
}
