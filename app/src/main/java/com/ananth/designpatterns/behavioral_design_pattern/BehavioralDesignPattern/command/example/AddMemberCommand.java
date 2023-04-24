package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.command.example;

//A concrete implementation of command
public class AddMemberCommand implements Command {

    private String emailAddress;
    private String listName;

    private EWSService receiver;

    public AddMemberCommand(String emailAddress, String listName, EWSService ewsService) {
        this.emailAddress = emailAddress;
        this.listName = listName;
        this.receiver = ewsService;
    }

    //This is our concrete command
    @Override
    public void execute() {
        receiver.addMember(emailAddress, listName);
    }
}
