package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.chain_of_responsibility.example;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;

public class Client {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args){

        LeaveApplication application = LeaveApplication.getBuilder()
                .withType(LeaveApplication.Type.Sick)
                .from(LocalDate.now())
                .to(LocalDate.of(2023,04,28))
                .build();
        System.out.println(application);
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);

        System.out.println(application);
    }

    public static LeaveApprover createChain(){
        Director director = new Director(null);
        Manager manager = new Manager(director);
        ProjectLead lead = new ProjectLead(manager);
        return lead;
    }
}
