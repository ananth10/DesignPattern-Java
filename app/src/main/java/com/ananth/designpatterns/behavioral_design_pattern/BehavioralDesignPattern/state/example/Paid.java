package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.state.example;

public class Paid implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("Contacting payment gateway tp rollback transaction");
        return 10;
    }
}
