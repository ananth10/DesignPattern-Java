package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.visitor.example;

public interface Visitor {

    void visit(Programmer programmer);
    void visit(ProjectLead projectLead);
    void visit(Manager manager);
    void visit(VicePresident vicePresident);
}
