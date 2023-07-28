package com.ananth.designpatterns.creational_design_pattern.factory_method.pizza;

public class VegPizzaCreator extends PizzaCreator{
    @Override
    protected Pizza makePizza() {
        return new VegPizza();
    }
}
