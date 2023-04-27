package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.iterator.example;

//Iterator interface allowing to iterate over
//values of an aggregate
public interface Iterator<T> {

    boolean hasNext();
    T next();
}
