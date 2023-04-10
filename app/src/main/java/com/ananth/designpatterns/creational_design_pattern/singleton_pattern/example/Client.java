package com.ananth.designpatterns.creational_design_pattern.singleton_pattern.example;

import com.ananth.designpatterns.creational_design_pattern.singleton_pattern.example.eager.EagerRegistry;
import com.ananth.designpatterns.creational_design_pattern.singleton_pattern.example.lazy.LazyRegistryIODH;
import com.ananth.designpatterns.creational_design_pattern.singleton_pattern.example.lazy.LazyRegistryWithDCL;

public class Client {

    public static void main(String[] args){
        EagerRegistry eagerRegistry = EagerRegistry.getInstance();
        EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();

        LazyRegistryWithDCL lazyRegistryWithDCL = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazyRegistryWithDC2 = LazyRegistryWithDCL.getInstance();

        System.out.println(lazyRegistryWithDCL==lazyRegistryWithDC2);

        LazyRegistryIODH instance = LazyRegistryIODH.getInstance();
        LazyRegistryIODH instance1 = LazyRegistryIODH.getInstance();
        System.out.println("Done");

    }
}
