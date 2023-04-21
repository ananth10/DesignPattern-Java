package com.ananth.designpatterns.structural_design_pattern.Flyweight.example;

import android.os.Build;

import androidx.annotation.RequiresApi;

public class Client {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args) {
        SystemErrorMessage errorMessage = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.GenericSystemError);
        System.out.println(errorMessage.getText("405"));

        UserBannedErrorMessage userBannedErrorMessage = ErrorMessageFactory.getInstance().getUserBannedMessage("405");
        System.out.println(userBannedErrorMessage.getText("405"));
    }
}
