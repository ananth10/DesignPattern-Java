package com.ananth.designpatterns.solid.dependency_inversion_principle.with_dip;

import com.ananth.designpatterns.solid.dependency_inversion_principle.Formatter;
import com.ananth.designpatterns.solid.dependency_inversion_principle.JsonFormatter;
import com.ananth.designpatterns.solid.dependency_inversion_principle.Message;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        Message message = new Message("Hi, welcome to shop");
        MessagePrinter messagePrinter = new MessagePrinter();
        filePrinter(messagePrinter,message);
    }

    static void filePrinter(MessagePrinter messagePrinter, Message message){
        Formatter formatter = new JsonFormatter();
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("yourfilename.json"));
            messagePrinter.writeMessage(message, writer, formatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //we can change the printing format
    static void systemOutPrinter(MessagePrinter messagePrinter, Message message){
        Formatter formatter = new JsonFormatter();
        try {
            PrintWriter writer = new PrintWriter(System.out);
            messagePrinter.writeMessage(message, writer, formatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
