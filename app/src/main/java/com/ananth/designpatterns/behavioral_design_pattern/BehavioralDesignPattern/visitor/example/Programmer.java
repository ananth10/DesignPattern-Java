package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.visitor.example;

public class Programmer extends AbstractEmployee {
    private String skill;

    public Programmer(String name, String skill) {
        super(name);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}