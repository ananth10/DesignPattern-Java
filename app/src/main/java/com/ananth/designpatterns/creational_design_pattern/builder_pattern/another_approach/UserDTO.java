package com.ananth.designpatterns.creational_design_pattern.builder_pattern.another_approach;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.ananth.designpatterns.creational_design_pattern.builder_pattern.Address;

import java.time.LocalDate;
import java.time.Period;

//Product
public class UserDTO {

    private String name;
    private String age;
    private String address;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //get builder instance
    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }

    //Builder
    public static class UserDTOBuilder {
        private String firstName;
        private String lastName;
        private String address;
        private String age;
        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + ", " + address.getStreet() + "\n" + address.getCity() + ", " + address.getState() + "\n" + address.getZipcode();
            return this;
        }

        @RequiresApi(api = Build.VERSION_CODES.O)
        public UserDTOBuilder withAge(LocalDate date) {
            Period period = Period.between(date, LocalDate.now());
            age = String.valueOf(period.getYears());
            return this;
        }

        public UserDTO build() {
            this.userDTO = new UserDTO();
            userDTO.setName(firstName + " " + lastName);
            userDTO.setAddress(address);
            userDTO.setAge(age);
            return this.userDTO;
        }

        public UserDTO getUserDTO() {
            return this.userDTO;
        }
    }
}
