package com.ananth.designpatterns.creational_design_pattern.factory_method.pizza;

public class ChickenPizzaCreator extends PizzaCreator {

    @Override
    protected Pizza makePizza() {
        return new ChickenPizza();
    }
}
