package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.memento.example;

public class WorkflowDesigner {
    private WorkFlow workFlow;

    public void createWorkFlow(String name) {
        workFlow = new WorkFlow(name);
    }

    private WorkFlow getWorkFlow() {
        return workFlow;
    }

    public Memento getMemento() {
        if(workFlow==null){
            return new Memento();
        }
        return new Memento(workFlow.getSteps(), workFlow.getName());
    }

    public void setMemento(Memento memento) {
     if(memento.isEmpty()){
         this.workFlow=null;
     }
     else{
         this.workFlow = new WorkFlow(memento.getName(), memento.getSteps());
     }
    }

    public void addSteps(String name) {
        workFlow.addStep(name);
    }

    public void removeSteps(String name) {
        workFlow.removeStep(name);
    }

    public void print() {
        System.out.println(workFlow);
    }

    //Memento
    public class Memento {
        private String[] steps;
        private String name;

        private Memento() {
        }

        private Memento(String[] steps, String name) {
            this.steps = steps;
            this.name = name;
        }

        private String[] getSteps() {
            return steps;
        }

        private String getName() {
            return name;
        }

        private boolean isEmpty(){
            return this.getSteps()==null && this.getName()==null;
        }

    }
}
