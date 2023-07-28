package com.ananth.designpatterns.creational_design_pattern.factory_method.pizza;

public class ChickenPizza extends Pizza{
    @Override
    public String getIngredients() {
        return "chicken pizza ingredients";
    }
}
