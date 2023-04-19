package com.ananth.designpatterns.structural_design_pattern.Facade.example.email;

public abstract class Template {

    public enum TemplateType {Email, NewsLetter};

    public abstract String format(Object obj);

}