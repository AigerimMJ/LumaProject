package org.example.lumaProject.models;

import com.github.javafaker.Faker;
import lombok.Builder;

@Builder

public class Users {

    Faker faker= new Faker();
    public String userFirstName;
    public String userLastName;
    public String userFullName;
    public String userEmail;
    public String userCurrentAddress;
    public String userPermanentAddress;
    public String userPassword;
    public String userMobileNumber;
    public String userState;
    public String userCity;
    public String gender;
    public String comment;


}

