package com.ananth.designpatterns.creational_design_pattern.prototype_pattern.example;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(-10,0,0),20);
        swordsman.attack();
        System.out.println(swordsman);

        Swordsman sm2 = (Swordsman) swordsman.clone();
        System.out.println(sm2);
        General general = new General();
    }
}
