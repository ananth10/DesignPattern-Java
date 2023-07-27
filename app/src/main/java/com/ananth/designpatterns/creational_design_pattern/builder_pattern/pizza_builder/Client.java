package com.ananth.designpatterns.creational_design_pattern.builder_pattern.pizza_builder;

public class Client {

    public static void main(String[] args) {
        NormalPizza normalPizza = makeNormalPizza();
        ChickenPizza chickenPizza = chickPizzaBuild(ChickenPizza.getBuilder(), normalPizza);
        System.out.println(chickenPizza);
    }

    private static ChickenPizza chickPizzaBuild(ChickenPizza.ChickenPizzaBuilder builder, NormalPizza normalPizza) {
        return builder.withNormalPizza(normalPizza)
                .withChicken("chicken")
                .withSpinach("spinach")
                .withBlackOlives("blackOlives")
                .build();
    }

    private static NormalPizza makeNormalPizza() {
        return new NormalPizza(1.5f, 4, 5, 1, 1);
    }
}
