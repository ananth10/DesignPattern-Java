package com.ananth.designpatterns.structural_design_pattern.Proxy.example;

import com.ananth.designpatterns.structural_design_pattern.Proxy.example.Point2D;

//Our concrete class providing actual functionality
public class BitmapImage implements Image {

    private Point2D location;
    private String name;

    public BitmapImage(String filename) {
        System.out.println("Loaded from disk:" + filename);
        this.name = name;
    }

    @Override
    public void setLocation(Point2D point2D) {
        location = point2D;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        //renders to screen
        System.out.println("Rendered " + this.name);
    }
}
