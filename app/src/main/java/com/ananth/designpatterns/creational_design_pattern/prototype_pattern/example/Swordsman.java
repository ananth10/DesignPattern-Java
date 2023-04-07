package com.ananth.designpatterns.creational_design_pattern.prototype_pattern.example;

public class Swordsman extends GameUnit{
    private String state = "idle";

    public void attack(){
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman{" +
                "state='" + state + '\'' +
                '}';
    }

    @Override
    protected void reset() {
        state = "idle";
    }
}
