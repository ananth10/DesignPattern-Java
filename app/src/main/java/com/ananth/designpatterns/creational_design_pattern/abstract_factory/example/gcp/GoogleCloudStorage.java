package com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.gcp;

import com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.Storage;

//Represent a concrete product in a family "Google cloud platform"
public class GoogleCloudStorage implements Storage {


    public GoogleCloudStorage(int capacityInMb) {
        System.out.println("Allocated" + capacityInMb + "on google cloud storage");
    }

    @Override
    public String getId() {
        return "gc1";
    }

    @Override
    public String toString() {
        return "GoogleCloudStorage{}";
    }
}
