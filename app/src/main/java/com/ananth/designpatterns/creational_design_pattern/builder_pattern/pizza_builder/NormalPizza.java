package com.ananth.designpatterns.creational_design_pattern.builder_pattern.pizza_builder;

public class NormalPizza {

    private float water;
    private int tomato;
    private int onion;
    private int flour;
    private int sugar;

    public NormalPizza(float water, int tomato, int onion, int flour, int sugar) {
        this.water = water;
        this.tomato = tomato;
        this.onion = onion;
        this.flour = flour;
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "NormalPizza{" +
                "water=" + water +
                ", tomato=" + tomato +
                ", onion=" + onion +
                ", flour=" + flour +
                ", sugar=" + sugar +
                '}';
    }
}
