package com.ananth.designpatterns.creational_design_pattern.prototype_pattern.example;

import androidx.annotation.NonNull;

//does not support cloning
public class General extends GameUnit{
    private String state = "idle";

    public void boostMorale(){
        this.state = "MoraleBoost";
    }

    @Override
    public String toString() {
        return "General{" +
                "state='" + state + '\'' +
                '}';
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset is not supported");
    }

    @NonNull
    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("General are unique");
    }
}
