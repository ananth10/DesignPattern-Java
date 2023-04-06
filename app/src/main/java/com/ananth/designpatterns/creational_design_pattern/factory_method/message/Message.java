package com.ananth.designpatterns.creational_design_pattern.factory_method.message;

/**
 * This class represent an interface to our "Product" which is our Message
 * Implementation will specific to our content type
 * */
public abstract class Message {
    public abstract String getContent();

    public void addDefaultHeaders(){
        //Adds come default headers
    }

    public void encrypt(){
        //has some code to encrypt content
    }
}
