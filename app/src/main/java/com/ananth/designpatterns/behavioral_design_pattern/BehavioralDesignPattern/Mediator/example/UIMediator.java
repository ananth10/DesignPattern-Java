package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.Mediator.example;

import java.util.ArrayList;
import java.util.List;

//Mediator
public class UIMediator {

    List<UIControl> colleagues = new ArrayList<>();


    public void register(UIControl uiControl) {
        colleagues.add(uiControl);
    }

    public void valueChanged(UIControl control) {
        colleagues.stream().filter(c -> c != control).forEach(uiControl ->
                uiControl.controlChanged(uiControl)
        );
    }
}
