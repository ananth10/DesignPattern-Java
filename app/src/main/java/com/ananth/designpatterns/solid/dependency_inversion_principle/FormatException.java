package com.ananth.designpatterns.solid.dependency_inversion_principle;

import java.io.IOException;

public class FormatException extends IOException {

    public FormatException(Exception cause){
        super(cause);
    }
}
