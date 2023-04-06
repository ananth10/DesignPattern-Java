package com.ananth.designpatterns.creational_design_pattern.factory_method.message;

public class TextMessage extends Message{

    @Override
    public String getContent() {
        return "Hi";
    }
}
