package com.ananth.designpatterns.creational_design_pattern.builder_pattern.pizza_builder;

//made it as immutable object
public class ChickenPizza {
    private NormalPizza normalPizza;
    private String chicken;

    private String blackOlives;

    private String spinach;

    public String getBlackOlives() {
        return blackOlives;
    }

    public void setBlackOlives(String blackOlives) {
        this.blackOlives = blackOlives;
    }

    public String getSpinach() {
        return spinach;
    }

    public void setSpinach(String spinach) {
        this.spinach = spinach;
    }

    public NormalPizza getNormalPizza() {
        return normalPizza;
    }

    public void setNormalPizza(NormalPizza normalPizza) {
        this.normalPizza = normalPizza;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public static ChickenPizzaBuilder getBuilder() {
        return new ChickenPizzaBuilder();
    }

    @Override
    public String toString() {
        return "ChickenPizza{" +
                "normalPizza=" + normalPizza +
                ", chicken='" + chicken + '\'' +
                ", blackOlives='" + blackOlives + '\'' +
                ", spinach='" + spinach + '\'' +
                '}';
    }

    public static class ChickenPizzaBuilder implements PizzaBuilder {
        private NormalPizza normalPizza;
        private String chicken;
        private String blackOlives;
        private String spinach;

        private ChickenPizza chickenPizza;

        @Override
        public PizzaBuilder withNormalPizza(NormalPizza normalPizza) {
            this.normalPizza = normalPizza;
            return this;
        }

        @Override
        public PizzaBuilder withChicken(String chicken) {
            this.chicken = chicken;
            return this;
        }

        @Override
        public PizzaBuilder withBlackOlives(String blackOlives) {
            this.blackOlives = blackOlives;
            return this;
        }

        @Override
        public PizzaBuilder withSpinach(String spinach) {
            this.spinach = spinach;
            return this;
        }

        @Override
        public ChickenPizza build() {
            this.chickenPizza = new ChickenPizza();
            chickenPizza.setNormalPizza(normalPizza);
            chickenPizza.setChicken(chicken);
            chickenPizza.setBlackOlives(blackOlives);
            chickenPizza.setSpinach(spinach);
            return chickenPizza;
        }

        @Override
        public ChickenPizza getChickenPizza() {
            return this.chickenPizza;
        }
    }
}
