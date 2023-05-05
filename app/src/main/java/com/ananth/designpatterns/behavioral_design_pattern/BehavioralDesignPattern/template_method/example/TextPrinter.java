package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.template_method.example;

import java.util.Map;

//Concrete implementation. Implements steps needed..
//..by template method
public class TextPrinter extends OrderPrinter {

    @Override
    protected String start() {
        return "Order details";
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return "Order #" + order.getId();
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder stringBuilder = new StringBuilder("Items\n...............................\n");

        for (Map.Entry<String, Double> entry : order.getItems().entrySet()) {
            stringBuilder.append(entry.getKey() + " $" + entry.getValue() + "\n");
        }
        stringBuilder.append("Items\n...............................\n");
        return stringBuilder.toString();
    }

    @Override
    protected String formatTotal(Order order) {
        System.out.println("Total: $" + order.getTotal());
        return "Total: $" + order.getTotal();
    }

    @Override
    protected String end() {
        return "";
    }
}
