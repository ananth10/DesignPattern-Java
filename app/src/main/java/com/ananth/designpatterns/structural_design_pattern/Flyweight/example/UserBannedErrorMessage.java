package com.ananth.designpatterns.structural_design_pattern.Flyweight.example;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.Duration;

//Unshared concrete flyweight
@RequiresApi(api = Build.VERSION_CODES.O)
public class UserBannedErrorMessage implements ErrorMessage {
    //All states defined here
    private String caseId;
    private String remarks;
    private Duration banDuration;
    private String message;

    public UserBannedErrorMessage(String caseId) {
        this.caseId = caseId;
        //Load case info from DB
        this.caseId = caseId;
        remarks = "You violated terms of use";
        banDuration = Duration.ofDays(2);
        message = "You are banned. Sorry. \nMore Information:\n";
        message += caseId + "\n";
        message += remarks + "\n";
        message += "Banned for:" + banDuration.toHours() + "Hours";
    }

    @Override
    public String getText(String code) {
        return message;
    }

    public String getCaseNo() {
        return caseId;
    }
}
