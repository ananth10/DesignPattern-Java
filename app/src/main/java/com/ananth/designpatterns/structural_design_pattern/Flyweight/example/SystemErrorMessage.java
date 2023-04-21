package com.ananth.designpatterns.structural_design_pattern.Flyweight.example;

//Concrete flyweight, instance is shared
public class SystemErrorMessage implements ErrorMessage {
    //Intrinsic states
    private String messageTemplate; //some error message $errorCode;
    public String helpUrlBase; //http://somdomain.com/help?error=

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    @Override
    public String getText(String code) { //here code is the extrinsic state
        return messageTemplate.replace("$errorCode", code) + helpUrlBase + code;
    }
}
