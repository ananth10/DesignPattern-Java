package com.ananth.designpatterns.creational_design_pattern.factory_method.message;

public class JSONMessage extends Message{

    @Override
    public String getContent() {
        return "{\"CodeValueId\": 10,\n" +
                "          \"Value\": \"Orange)\"}";
    }
}
