package com.ananth.designpatterns.structural_design_pattern.Facade.example.email;

public class OrderEmailTemplate extends Template{
    @Override
    public String format(Object obj) {
        return "Template";
    }
}
