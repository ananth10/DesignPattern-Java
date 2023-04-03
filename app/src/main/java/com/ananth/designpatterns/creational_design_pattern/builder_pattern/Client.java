package com.ananth.designpatterns.creational_design_pattern.builder_pattern;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;

//this is our client which also works like a "director"
@RequiresApi(api = Build.VERSION_CODES.O)
public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder userDTOBuilder = new UserWebDTOBuilder();
        UserDTO dto = directBuild(userDTOBuilder, user);
        System.out.printf(String.valueOf(dto));
    }

    private static UserDTO directBuild(UserDTOBuilder userDTOBuilder, User user) {
        return userDTOBuilder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    //Returns a sample user

    public static User createUser() {
        User user = new User();
        user.setFirstName("Will");
        user.setLastName("Smith");
        user.setBirthday(LocalDate.of(1990, 06, 10));
        Address address = new Address();
        address.setHouseNumber("10/190");
        address.setCity("Miami");
        address.setState("Florida");
        address.setZipcode("33311");
        user.setAddress(address);
        return user;
    }
}
