package com.ananth.designpatterns.structural_design_pattern.Facade.example.email;

public class Email {

    public static EmailBuilder getBuilder(){
        return new EmailBuilder();
    }
}
