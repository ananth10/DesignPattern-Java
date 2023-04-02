package com.ananth.designpatterns.solid.open_closed_principle.with_ocp;

public class MainClass {

    BankEmployee bankEmployee = new BankEmployee();
    GovernmentEmployee governmentEmployee = new GovernmentEmployee();
    SoftwareEmployee softwareEmployee = new SoftwareEmployee();

    void mainFunction(){
        createBankEmp();
        createGovEmp();
        createSoftEmp();
    }

    void createBankEmp(){
        bankEmployee.setName("john");
        bankEmployee.setId(String.valueOf(bankEmployee.generateBankEmpId()));
        bankEmployee.setMobile("123123123");
        bankEmployee.setAddress("new street, usa");
        bankEmployee.saveEmpDetail();
    }
    void createGovEmp(){
        governmentEmployee.setName("john");
        governmentEmployee.setId(String.valueOf(governmentEmployee.generateBankEmpId()));
        governmentEmployee.setMobile("123123123");
        governmentEmployee.setAddress("new street, usa");
        governmentEmployee.saveEmpDetail();
    }
    void createSoftEmp(){
        softwareEmployee.setName("john");
        softwareEmployee.setId(String.valueOf(softwareEmployee.generateBankEmpId()));
        softwareEmployee.setMobile("123123123");
        softwareEmployee.setAddress("new street, usa");
        softwareEmployee.saveEmpDetail();
    }
}
