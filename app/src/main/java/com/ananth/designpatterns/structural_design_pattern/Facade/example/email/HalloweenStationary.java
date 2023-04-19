package com.ananth.designpatterns.structural_design_pattern.Facade.example.email;

public class HalloweenStationary implements Stationary {
    @Override
    public String getHeader() {
        return "It's Halloween!!";
    }

    @Override
    public String getFooter() {
        return "BUY MORE STUFF! It's Halloween, c'mon!!";
    }
}
