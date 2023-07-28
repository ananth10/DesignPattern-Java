package com.ananth.designpatterns.creational_design_pattern.factory_method.pizza;

public class VegPizza extends Pizza{
    @Override
    public String getIngredients() {
        return "veg pizza ingredient";
    }
}
