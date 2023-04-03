package com.ananth.designpatterns.creational_design_pattern.builder_pattern;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String  age;

    private String address;

    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public UserDTOBuilder withBirthday(LocalDate birthday) {
        Period ageInYears = Period.between(birthday,LocalDate.now());
        age = String.valueOf(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber()+", "+ address.getStreet()+"\n"+address.getCity()+"\n"+address.getState()+"\n"+address.getZipcode();
        return this;
    }

    @Override
    public UserWebDTO build() {
        dto = new UserWebDTO(firstName+" "+lastName,address,age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
