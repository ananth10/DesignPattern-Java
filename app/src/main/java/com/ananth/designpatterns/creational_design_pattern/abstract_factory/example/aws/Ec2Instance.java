package com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.aws;

import com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.Instance;
import com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.Storage;

//Represents a concrete product in a family "Amazon Web Services"
public class Ec2Instance implements Instance {

    public Ec2Instance(Capacity capacity) {
        //Map capacity to ec2 instance types, Use aws API to provision
        System.out.println("Created ec2 instance");
    }

    @Override
    public void start() {
        System.out.println("Ec2 instance started");
    }

    @Override
    public void stop() {
        System.out.println("Ec2 instance ended");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attache"+storage+"Ec2 instnace");
    }

    @Override
    public String toString() {
        return "Ec2Instance{}";
    }
}
