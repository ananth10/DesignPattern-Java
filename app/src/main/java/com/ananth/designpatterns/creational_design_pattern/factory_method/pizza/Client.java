package com.ananth.designpatterns.creational_design_pattern.factory_method.pizza;

public class Client {

    public static void main(String[] args){
        deliverPizza(new ChickenPizzaCreator());
        deliverPizza(new VegPizzaCreator());
    }

    public static void deliverPizza(PizzaCreator pizzaCreator){
        Pizza pizza = pizzaCreator.getPizza();
        System.out.println(pizza.getIngredients());
    }
}
