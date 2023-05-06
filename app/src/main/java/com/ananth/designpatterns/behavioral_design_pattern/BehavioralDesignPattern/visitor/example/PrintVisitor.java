package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.visitor.example;

public class PrintVisitor implements Visitor {
    @Override
    public void visit(Programmer programmer) {
        String message = programmer.getName() + " is a " + programmer.getSkill() + " programmer";
        System.out.println(message);
    }

    @Override
    public void visit(ProjectLead projectLead) {
        String message = projectLead.getName() + " is a Project Lead with " + projectLead.getDirectReports().size()+" programmers reporting";
        System.out.println(message);
    }

    @Override
    public void visit(Manager manager) {
        String message = manager.getName() + " is a Manager for " + manager.getDirectReports().size()+" project leads";
        System.out.println(message);
    }

    @Override
    public void visit(VicePresident vicePresident) {
        String message = vicePresident.getName() + " is a VP for " + vicePresident.getDirectReports().size()+" managers";
        System.out.println(message);
    }
}
