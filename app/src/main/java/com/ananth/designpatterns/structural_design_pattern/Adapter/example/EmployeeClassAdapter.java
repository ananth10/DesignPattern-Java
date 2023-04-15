package com.ananth.designpatterns.structural_design_pattern.Adapter.example;

//A class adapter works like two-way
public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
