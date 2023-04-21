package com.ananth.designpatterns.structural_design_pattern.Flyweight.example;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Map;

//Flyweight factory, Returns shared flyweight based on key
public class ErrorMessageFactory {
    //this serves as key for getting flyweight instance.
    public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

    private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory() {
        errorMessages.put(ErrorType.GenericSystemError, new SystemErrorMessage("A generic error of type $errorCode occurred, please refer to:\n", "http://google.com/q="));
        errorMessages.put(ErrorType.PageNotFoundError, new SystemErrorMessage("A page not found error of type $errorCode occurred, please refer to:\n", "http://google.com/q="));
    }

    public SystemErrorMessage getError(ErrorType type) {
        return errorMessages.get(type);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public UserBannedErrorMessage getUserBannedMessage(String caseId) {
        return new UserBannedErrorMessage(caseId);
    }
}
