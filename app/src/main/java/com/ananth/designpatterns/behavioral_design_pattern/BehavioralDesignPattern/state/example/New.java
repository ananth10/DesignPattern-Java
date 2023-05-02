package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.state.example;

public class New implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("Its a new order, no processing done!");
        return 0;
    }
}
