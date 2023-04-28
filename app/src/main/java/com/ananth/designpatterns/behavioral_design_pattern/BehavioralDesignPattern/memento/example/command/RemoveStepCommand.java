package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.memento.example.command;

import com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.memento.example.WorkflowDesigner;

public class RemoveStepCommand extends AbstractWorkflowCommand {

    private String step;

    public RemoveStepCommand(WorkflowDesigner workflowDesigner, String step) {
        super(workflowDesigner);
        this.step = step;
    }

    @Override
    public void execute() {
        memento = receiver.getMemento();
        receiver.removeSteps(step);
    }
}
