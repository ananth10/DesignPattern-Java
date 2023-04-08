package com.ananth.designpatterns.creational_design_pattern.abstract_factory.example;

import com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.aws.AwsResourceFactory;
import com.ananth.designpatterns.creational_design_pattern.abstract_factory.example.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int capMib) {
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(capMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client client = new Client(new AwsResourceFactory());
        Instance instance1 = client.createServer(Instance.Capacity.micro, 20);
        instance1.start();
        instance1.stop();

        Client client1 = new Client(new GoogleResourceFactory());
        instance1 = client1.createServer(Instance.Capacity.micro, 20);
        instance1.start();
        instance1.stop();
    }
}
