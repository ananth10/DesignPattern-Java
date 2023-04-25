package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.interpreter.example;

public class Client {

    public static void main(String[] args){
     Report report = new Report("Cashflow","NOT ADMIN");
     ExpressionBuilder builder = new ExpressionBuilder();

     PermissionExpression permissionExpression = builder.build(report);
        System.out.println(permissionExpression);

        User user = new User("Dave","USER","ADMIN");

        System.out.println("User access report:"+ permissionExpression.interpret(user));
    }
}
