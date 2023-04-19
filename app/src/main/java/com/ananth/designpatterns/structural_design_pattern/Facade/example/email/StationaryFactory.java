package com.ananth.designpatterns.structural_design_pattern.Facade.example.email;

public class StationaryFactory {

    public static Stationary createStationary(){
        return new HalloweenStationary();
    }
}
