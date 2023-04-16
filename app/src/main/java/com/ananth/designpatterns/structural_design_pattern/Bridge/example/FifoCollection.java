package com.ananth.designpatterns.structural_design_pattern.Bridge.example;

/**
 * This is the abstraction.
 * It represents the First In First Out Collection
 * */
public interface FifoCollection<T> {

    //Adds element to collection
    void offer(T element);

    //Removes and returns first element from collection
    T poll();
}
