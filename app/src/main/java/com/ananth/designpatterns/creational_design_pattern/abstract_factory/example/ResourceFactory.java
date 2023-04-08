package com.ananth.designpatterns.creational_design_pattern.abstract_factory.example;

//This is Abstract Factory with methods defined for each object type
public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMib);
}
