package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.state.example;

public class Delivered implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("Connecting courier service for item pickup");
        System.out.println("Payment roll back will be initiated upon receiving returned item");
        return 30;
    }
}
