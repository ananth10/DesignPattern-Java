package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.null_object.example;

public class Client {

    public static void main(String[] args){
//        ComplexService service = new ComplexService("Simple report",new StorageService());
        ComplexService service = new ComplexService("Simple report",new NullStorageService());
        service.generateReport();
    }
}
