package com.ananth.designpatterns.creational_design_pattern.abstract_factory.example;

//Represents abstract product
public interface Instance {
    enum Capacity {micro, small, large}

    void start();

    void stop();

    void attachStorage(Storage storage);
}
