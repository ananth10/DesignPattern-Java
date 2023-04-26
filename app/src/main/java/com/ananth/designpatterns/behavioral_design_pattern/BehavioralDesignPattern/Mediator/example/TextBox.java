package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.Mediator.example;




//public class TextBox extends TextField implements UIControl {
//
//    private UIMediator mediator;
//    private boolean mediatedUpdate;
//
//    public TextBox(UIMediator uiMediator) {
//        this.mediator = uiMediator;
//        this.mediator.register(this);
////        this.setText("Textbox");
//
////        this.textProperty().addListener((v,o,n)->{
////              if(!mediatedUpdate)
////            this.mediator.valueChanged(this);
////        });
//    }
//
//    @Override
//    public void controlChanged(UIControl uiControl) {
//        mediatedUpdate = true;
////        this.setText(uiControl.getControlValue());
//        mediatedUpdate = false;
//    }
//
//    @Override
//    public String getControlValue() {
////        return getText();
//    }
//
//    @Override
//    public String getControlName() {
//        return "TextBox";
//    }
//}
