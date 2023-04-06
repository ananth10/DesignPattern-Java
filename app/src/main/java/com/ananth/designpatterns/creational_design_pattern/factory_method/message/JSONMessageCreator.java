package com.ananth.designpatterns.creational_design_pattern.factory_method.message;

//Provides the implementation for JSONMessage
public class JSONMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
