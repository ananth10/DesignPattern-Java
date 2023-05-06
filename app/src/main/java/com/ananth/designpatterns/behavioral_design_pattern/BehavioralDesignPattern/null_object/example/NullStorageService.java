package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.null_object.example;

public class NullStorageService extends StorageService{

    @Override
    public void save(Report report) {
        System.out.println("NullStorage save function");
    }
}
