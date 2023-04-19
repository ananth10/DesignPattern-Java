package com.ananth.designpatterns.structural_design_pattern.Facade.example.email;

public class TemplateFactory {

    public static Template createTemplateFor(Template.TemplateType type){
        switch (type){
            case Email:
                return new OrderEmailTemplate();
            default:
                throw new IllegalArgumentException("Unknown template typ[e");
        }
    }
}
