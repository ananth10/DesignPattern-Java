package com.ananth.designpatterns.structural_design_pattern.Adapter.example;

public class Main {

    public static void main(String[] args){
        //Using the class two-way adapter
        EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
        popupateEmployeeData(employeeClassAdapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(employeeClassAdapter);
        System.out.println(card);

        //Using the object adapter
        Employee employee = new Employee();
        popupateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        String card1 = designer.designCard(objectAdapter);
        System.out.println(card1);
    }

    private static void popupateEmployeeData(Employee employee){
        employee.setFullName("John will");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Chichaco, USA");
    }
}
