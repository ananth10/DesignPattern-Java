package com.ananth.designpatterns.solid.open_closed_principle.with_ocp;

import java.util.Random;

public class BankEmployee extends Employee{

    @Override
    void saveEmpDetail() {
      //call save function
      //saveBankEmp(getName(),getId(),getMobile(),getAddress())
    }

   public int generateBankEmpId(){
        return new Random().nextInt();
    }
}
