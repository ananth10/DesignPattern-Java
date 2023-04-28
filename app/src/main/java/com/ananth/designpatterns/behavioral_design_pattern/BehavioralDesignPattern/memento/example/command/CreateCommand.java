package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.memento.example.command;

import com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.memento.example.WorkflowDesigner;

public class CreateCommand extends AbstractWorkflowCommand{

    private String name;

    public CreateCommand(WorkflowDesigner workflowDesigner,String name) {
        super(workflowDesigner);
        this.name = name;
    }

    @Override
    public void execute() {
     this.memento = receiver.getMemento();
     receiver.createWorkFlow(name);
    }
}
