package com.ananth.designpatterns.structural_design_pattern.Proxy.example;

public class Client {

    public static void main(String[] args){

        Image image = ImageFactory.getImage("myPic.jpg");

        image.setLocation(new Point2D(10,10));

        System.out.printf("Location::"+image.getLocation());

        System.out.println("Rendering image now");
        image.render();
    }
}
