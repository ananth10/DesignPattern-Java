package com.ananth.designpatterns.creational_design_pattern.factory_method.message;

//Provides implementation for TextMessage
public class TextMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
