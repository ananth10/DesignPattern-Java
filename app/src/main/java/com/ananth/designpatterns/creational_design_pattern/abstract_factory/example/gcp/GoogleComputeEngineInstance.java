package com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.gcp;

import com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.Instance;
import com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.Storage;

//Represents a concrete product in a family "Google Cloud Platform"
public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        //Map capacity to gcp Compute instance types. Use GCP API to provision
        System.out.println("Created Google Compute Engine Instance");
    }

    @Override
    public void start() {
        System.out.println("Compute instance started");
    }

    @Override
    public void stop() {
        System.out.println("Compute instance stopped");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached" + storage + "to Compute engine instance");
    }

    @Override
    public String toString() {
        return "GoogleComputeEngineInstance{}";
    }
}
