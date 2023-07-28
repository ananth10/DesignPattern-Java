package com.ananth.designpatterns.creational_design_pattern.factory_method.pizza;

public abstract class Pizza {

    public abstract String getIngredients();

    public void addDefaultTopping(){
        //we can add some default toppings
    }

    public void makeParcel(){
        //we can some code to parcel the pizza
    }
}
