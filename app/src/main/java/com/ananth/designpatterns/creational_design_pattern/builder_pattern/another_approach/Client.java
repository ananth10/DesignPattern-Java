package com.ananth.designpatterns.creational_design_pattern.builder_pattern.another_approach;


import android.os.Build;

import androidx.annotation.RequiresApi;

import com.ananth.designpatterns.creational_design_pattern.builder_pattern.Address;
import com.ananth.designpatterns.creational_design_pattern.builder_pattern.User;

import java.time.LocalDate;

@RequiresApi(api = Build.VERSION_CODES.O)
public class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDTO dto = directBuild(UserDTO.getBuilder(), user);
        System.out.printf(String.valueOf(dto));
    }

    private static UserDTO directBuild(UserDTO.UserDTOBuilder userDTOBuilder, User user) {
        return userDTOBuilder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAge(user.getBirthday())
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
