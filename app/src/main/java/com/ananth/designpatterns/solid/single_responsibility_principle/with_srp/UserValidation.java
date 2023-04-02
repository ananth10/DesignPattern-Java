package com.ananth.designpatterns.solid.single_responsibility_principle.with_srp;

public class UserValidation {

    private String name;
    private int age;
    private String location;

    public UserValidation(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    boolean isUserDataValid() {
        if (name.isEmpty() || age == 0 || location.isEmpty()) {
            return false;
        }
        return true;
    }
}
