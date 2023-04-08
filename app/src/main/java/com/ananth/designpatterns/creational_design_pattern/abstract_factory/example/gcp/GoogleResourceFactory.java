package com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.gcp;

import com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.Instance;
import com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.ResourceFactory;
import com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.Storage;

//Factory implementation for google platform resources
public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
