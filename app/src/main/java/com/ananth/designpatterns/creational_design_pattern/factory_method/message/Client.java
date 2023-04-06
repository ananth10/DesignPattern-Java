package com.ananth.designpatterns.creational_design_pattern.factory_method.message;

public class Client {

    public static void main(String[] args){
      printMessage(new JSONMessageCreator());

      printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator){
      Message message = creator.createMessage();
        System.out.println(message);
        System.out.println(message.getContent());
    }
}
