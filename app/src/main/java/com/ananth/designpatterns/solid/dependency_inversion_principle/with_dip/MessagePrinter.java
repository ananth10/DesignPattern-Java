package com.ananth.designpatterns.solid.dependency_inversion_principle.with_dip;

import com.ananth.designpatterns.solid.dependency_inversion_principle.Formatter;
import com.ananth.designpatterns.solid.dependency_inversion_principle.Message;

import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

    //now below function is not tightly couple with dependency such as PrintWriter and Formatter
    //so we can pass any writer and formatter that we want without changing the high level business rule

    //now creating object for dependency responsibility is taken care by client or caller function
    public void writeMessage(Message message,PrintWriter writer,Formatter formatter)throws IOException {
            writer.println(formatter.format(message));
            writer.flush();
    }
}
