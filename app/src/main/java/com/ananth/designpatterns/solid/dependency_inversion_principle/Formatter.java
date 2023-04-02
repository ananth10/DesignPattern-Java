package com.ananth.designpatterns.solid.dependency_inversion_principle;

import java.io.IOException;

public interface Formatter {

    public String format(Message message) throws IOException;
}
