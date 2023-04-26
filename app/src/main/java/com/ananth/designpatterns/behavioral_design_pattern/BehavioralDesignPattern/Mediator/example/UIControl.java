package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.Mediator.example;

//Abstract colleague
public interface UIControl {

    void controlChanged(UIControl uiControl);
    String getControlValue();
    String getControlName();
}
