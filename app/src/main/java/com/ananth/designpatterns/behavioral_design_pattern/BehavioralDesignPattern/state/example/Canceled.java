package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.state.example;

public class Canceled implements OrderState{
    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Canceled order, cannot cancel anymore!");
    }
}
