package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.visitor.example;

import java.util.Collection;

public interface Employee {

    int getPerformanceRating();

    void setPerformanceRating(int rating);

    Collection<Employee> getDirectReports();

    int getEmployeeId();
}
