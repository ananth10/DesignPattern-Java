package com.ananth.designpatterns.creational_design_pattern.builder_pattern.pizza_builder;

//Abstract builder
public interface PizzaBuilder {

    PizzaBuilder withNormalPizza(NormalPizza normalPizza);
    PizzaBuilder withChicken(String chicken);
    PizzaBuilder withBlackOlives(String blackOlives);
    PizzaBuilder withSpinach(String spinach);

    ChickenPizza build();
    ChickenPizza getChickenPizza();

}
