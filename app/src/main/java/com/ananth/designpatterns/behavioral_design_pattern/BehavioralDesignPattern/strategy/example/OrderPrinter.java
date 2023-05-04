package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.strategy.example;

import java.util.Collection;
import java.util.Collections;

//strategy interface
public interface OrderPrinter {

    public void print(Collection<Order> orderCollections);
}
