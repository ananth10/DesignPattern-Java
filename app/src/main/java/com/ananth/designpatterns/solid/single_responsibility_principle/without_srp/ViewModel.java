package com.ananth.designpatterns.solid.single_responsibility_principle.without_srp;

//consider this as view model class
//primary function of ViewModel is intermediate between view and data source but here its doing more than one job
//that is validating user details
public class ViewModel {

    private User user;
    void createUser(){
        //call the user repository
        if(isUserDataValid("",0,""));{
            //call a function in repository to create user request
        }
    }

    void fetchUserDetails(){
        //call user repository to fetch logged in user details
        user = new User();
    }

    public User getUserDetails(){
        return user; //con
    }

    //should not be here
    boolean isUserDataValid(String name,int age, String location){
        if(name.isEmpty() || age==0 || location.isEmpty()){
            return false;
        }
        return true;
    }
}
