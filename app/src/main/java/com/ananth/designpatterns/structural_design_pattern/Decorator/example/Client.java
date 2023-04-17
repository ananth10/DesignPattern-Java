package com.ananth.designpatterns.structural_design_pattern.Decorator.example;

import android.os.Build;

import androidx.annotation.RequiresApi;

public class Client {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args){

         TextMessage message = new TextMessage("Hi <bold>, welcome to the design pattern class!!");
        System.out.println(message.getContent());

        Message decorator = new Base64EncodingMessage(message);
        System.out.println(decorator.getContent());

//        HtmlEncodingMessage htmlEncodingMessage = new HtmlEncodingMessage(base64EncodingMessage);
        decorator= new HtmlEncodingMessage(message);
        System.out.println(decorator.getContent());
    }
}
