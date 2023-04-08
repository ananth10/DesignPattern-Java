package com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.aws;

import com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.Instance;
import com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.ResourceFactory;
import com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.Storage;

//Factory implementation of aws resource
public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
