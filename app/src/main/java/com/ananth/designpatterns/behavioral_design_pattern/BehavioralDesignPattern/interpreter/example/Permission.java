package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.interpreter.example;

//this is the terminal expression
public class Permission implements PermissionExpression{
    private String permission;

    public Permission(String permission) {
        this.permission = permission.toLowerCase();
    }

    @Override
    public boolean interpret(User user) {
        return user.getPermissions().contains(permission);
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permission='" + permission + '\'' +
                '}';
    }
}
