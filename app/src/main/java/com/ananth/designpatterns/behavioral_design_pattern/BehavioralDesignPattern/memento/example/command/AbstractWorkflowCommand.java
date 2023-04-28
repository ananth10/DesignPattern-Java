package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.memento.example.command;

import com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.memento.example.WorkflowDesigner;

public abstract class AbstractWorkflowCommand implements WorkflowCommand {
    protected WorkflowDesigner.Memento memento;

    protected WorkflowDesigner receiver;

    public AbstractWorkflowCommand(WorkflowDesigner workflowDesigner) {
        this.receiver = workflowDesigner;
    }

    @Override
    public void undo() {
        receiver.setMemento(memento);
    }
}
