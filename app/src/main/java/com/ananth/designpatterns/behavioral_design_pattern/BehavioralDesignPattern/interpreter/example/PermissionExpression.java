package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.interpreter.example;

//Abstract expression
public interface PermissionExpression {

    boolean interpret(User user);
}
