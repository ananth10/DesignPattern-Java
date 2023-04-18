package com.ananth.designpatterns.structural_design_pattern.Decorator.example;

//Concrete component, object to be decorated
public class TextMessage implements Message{
    String message;

    public TextMessage(String message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message;
    }

    @Override
    public String toString() {
        return "TextMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}
