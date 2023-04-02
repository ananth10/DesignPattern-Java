package com.ananth.designpatterns.solid.dependency_inversion_principle.without_dip;

import com.ananth.designpatterns.solid.dependency_inversion_principle.Message;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Message message = new Message("Hi, welcome to shop");
        MessagePrinter messagePrinter = new MessagePrinter();
        messagePrinter.writeMessage(message,"yourfilename.json");
    }
}
