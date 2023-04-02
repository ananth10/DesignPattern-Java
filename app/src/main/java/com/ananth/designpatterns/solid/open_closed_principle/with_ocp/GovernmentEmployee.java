package com.ananth.designpatterns.solid.open_closed_principle.with_ocp;

import java.util.Random;

public class GovernmentEmployee extends Employee {
    @Override
    void saveEmpDetail() {
        //call save function
        //saveGovEmp(getName(),getId(),getMobile(),getAddress())
    }

    int generateBankEmpId(){
        return new Random().nextInt();
    }
}
