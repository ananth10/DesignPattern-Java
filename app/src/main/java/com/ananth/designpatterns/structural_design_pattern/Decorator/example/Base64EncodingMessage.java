package com.ananth.designpatterns.structural_design_pattern.Decorator.example;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Base64;

//decorator class implements component interface
public class Base64EncodingMessage implements Message {

    Message message;

    public Base64EncodingMessage(Message message) {
        this.message = message;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(message.getContent().getBytes());
    }
}
