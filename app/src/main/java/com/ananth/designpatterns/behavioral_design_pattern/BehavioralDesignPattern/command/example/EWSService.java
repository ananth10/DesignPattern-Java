package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.command.example;

//This class this the receiver
public class EWSService {

    public void addMember(String contact, String contactGroup){
        //contact exchange
        System.out.println("Added "+contact+" to "+contactGroup);
    }

    public void removeMember(String contact, String contactGroup){
        //contact exchange
        System.out.println("Removed "+contact+" from "+contactGroup);
    }
}
