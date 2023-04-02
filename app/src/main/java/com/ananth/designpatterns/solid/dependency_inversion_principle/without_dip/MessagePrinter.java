package com.ananth.designpatterns.solid.dependency_inversion_principle.without_dip;

import com.ananth.designpatterns.solid.dependency_inversion_principle.Formatter;
import com.ananth.designpatterns.solid.dependency_inversion_principle.JsonFormatter;
import com.ananth.designpatterns.solid.dependency_inversion_principle.Message;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

    public void writeMessage(Message message, String filename)throws IOException{
        Formatter formatter = new JsonFormatter();//creates formatter
        try(PrintWriter writer = new PrintWriter(new FileWriter(filename))){
            writer.println(formatter.format(message));
            writer.flush();
        }

    }
}
