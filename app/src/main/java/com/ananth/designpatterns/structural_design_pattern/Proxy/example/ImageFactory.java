package com.ananth.designpatterns.structural_design_pattern.Proxy.example;

//Factory to get image object
public class ImageFactory {
    //we will provide proxy to caller instead of real object

    public static Image getImage(String name){
        return new ImageProxy(name);
    }
}
