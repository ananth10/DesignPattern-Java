package com.ananth.designpatterns.structural_design_pattern.Facade.example.email;

public class Mailer {

    private static final Mailer MAILER = new Mailer();

    public static Mailer getMailer() {
        return MAILER;
    }

    private Mailer() {

    }

    public boolean send(Email email) {
        return true;
    }
}
