package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.chain_of_responsibility.example;

import android.os.Build;

import androidx.annotation.RequiresApi;

//A concrete handler
public class ProjectLead extends Employee{


    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected boolean processRequest(LeaveApplication application) {
        if(application.getType()== LeaveApplication.Type.Sick){
            if(application.getNoOfDays()<=2) {
                application.approve(getApproverRole());
                return true;
            }
        }
        return false;
    }
}
