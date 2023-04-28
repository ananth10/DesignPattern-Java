package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.memento.example.command;

import com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.memento.example.WorkflowDesigner;

public class AddStepCommand extends AbstractWorkflowCommand {

    private String step;

    public AddStepCommand(WorkflowDesigner workflowDesigner, String step) {
        super(workflowDesigner);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.addSteps(step);
    }
}
