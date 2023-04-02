package com.ananth.designpatterns.solid.dependency_inversion_principle;

import java.time.LocalDateTime;

public class Message {
    private String message;
    private LocalDateTime timeStamp;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
