package com.ananth.designpatterns.structural_design_pattern.Adapter.example;

public class BusinessCardDesigner {


    public String designCard(Customer customer){
        String card = "";
        card+=customer.getName();
        card+=customer.getDesignation();
        card+=customer.getAddress();
        return card;
    }
}
