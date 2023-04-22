package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.chain_of_responsibility.example;

import android.os.Build;

import androidx.annotation.RequiresApi;

//A concrete handler
public class Manager extends Employee {

    public Manager(LeaveApprover nextApprover) {
        super("Manager", nextApprover);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected boolean processRequest(LeaveApplication application) {
        switch (application.getType()){
            case Sick:
                application.approve(getApproverRole());
                return true;
            case PTO:
                if(application.getNoOfDays()<=5){
                    application.approve(getApproverRole());
                    return true;
                }
        }
        return false;
    }
}
