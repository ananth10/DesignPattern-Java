package com.ananth.designpatterns.structural_design_pattern.Proxy.example;

import com.ananth.designpatterns.structural_design_pattern.Proxy.example.Point2D;

//interface implemented by proxy and concrete class
public interface Image {
    void setLocation(Point2D point2D);
    Point2D getLocation();
    void render();
}
