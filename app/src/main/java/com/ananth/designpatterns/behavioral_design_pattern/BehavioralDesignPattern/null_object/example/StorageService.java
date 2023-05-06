package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.null_object.example;


import java.io.IOException;
import java.io.PrintWriter;

public class StorageService {

    public void save(Report report) {
        System.out.println("Writing report out!!");
        try (PrintWriter writer = new PrintWriter(report.getName() + ".txt")) {
            writer.println(report.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
