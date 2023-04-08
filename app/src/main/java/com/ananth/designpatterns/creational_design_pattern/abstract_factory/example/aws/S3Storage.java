package com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.aws;

import com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.Storage;

public class S3Storage implements Storage {

    public S3Storage(int capacityInMb) {
        System.out.println("Allocated"+capacityInMb+"on S3");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3Storage{}";
    }
}
