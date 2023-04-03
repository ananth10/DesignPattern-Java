package com.ananth.designpatterns.creational_design_pattern.builder_pattern;

import java.time.LocalDate;

//Abstract builder
public interface UserDTOBuilder {
    //methods to build "parts" of product at a time

    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthday(LocalDate birthday);
    UserDTOBuilder withAddress(Address address);
    //Method to "assemble" final product
    UserDTO build();
    //Method to fetch a already build object
    UserDTO getUserDTO();

}
