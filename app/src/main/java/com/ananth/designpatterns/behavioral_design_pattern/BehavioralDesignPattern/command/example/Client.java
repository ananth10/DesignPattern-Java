package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.command.example;

public class Client {

    public static void main(String[] args) throws InterruptedException{
        EWSService receiver = new EWSService();
        Command c1 = new AddMemberCommand("a@a.com","spam",receiver);
        MailTaskRunner.getInstance().addCommand(c1);

        Command c2 = new AddMemberCommand("b@b.com","work",receiver);
        MailTaskRunner.getInstance().addCommand(c2);

        Thread.sleep(3000);
        MailTaskRunner.getInstance().shutdown();
    }
}
