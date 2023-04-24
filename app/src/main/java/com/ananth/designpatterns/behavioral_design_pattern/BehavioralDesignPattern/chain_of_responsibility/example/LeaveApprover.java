package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.chain_of_responsibility.example;

//This represents a handler in chain of responsibility
public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication application);

    String getApproverRole();
}
