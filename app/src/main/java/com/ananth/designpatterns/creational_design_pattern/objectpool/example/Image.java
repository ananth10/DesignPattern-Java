package com.ananth.designpatterns.creational_design_pattern.objectpool.example;

//Represents our abstract reusable
public interface Image extends Poolable{

    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);
}
