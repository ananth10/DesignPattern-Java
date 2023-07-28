package com.ananth.designpatterns.creational_design_pattern.factory_method.pizza;

//abstract class
public abstract class PizzaCreator {


    public Pizza getPizza(){
        Pizza pizza = makePizza();
        pizza.addDefaultTopping();
        pizza.makeParcel();
        return pizza;
    }

    //factory method
    protected abstract Pizza makePizza();
}
