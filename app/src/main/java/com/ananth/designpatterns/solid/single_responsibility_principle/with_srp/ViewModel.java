package com.ananth.designpatterns.solid.single_responsibility_principle.with_srp;

import com.ananth.designpatterns.solid.single_responsibility_principle.without_srp.User;

//consider this as view model class
//primary function of ViewModel is intermediate between view and data source
public class ViewModel {

    private User user;
    private UserValidation userValidation;

    void createUser() {
        //call the user repository
        userValidation = new UserValidation("", 0, "");
        if (userValidation.isUserDataValid()) //moved validation logic to different class
        {
            //call a function in repository to create user request
        }
    }

    void fetchUserDetails() {
        //call user repository to fetch logged in user details
        user = new User();
    }

    public User getUserDetails() {
        return user; //con
    }
}
