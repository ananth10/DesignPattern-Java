package com.ananth.designpatterns.creational_design_pattern.factory_method.message;

/**
 * This is our abstract "creator".
 * The abstract method createMessage() has to be implemented by subclasses
 * */
public abstract class MessageCreator {

    public Message getMessage(){
        //we are doing some additional changes before giving back to client
     Message message = createMessage();
     message.addDefaultHeaders();
     message.encrypt();
     return message;
    }

    //Factory Method
    protected abstract Message createMessage();
}
