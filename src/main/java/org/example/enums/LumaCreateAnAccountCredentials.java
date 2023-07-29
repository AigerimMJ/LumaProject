package org.example.enums;

import lombok.Getter;

public enum LumaCreateAnAccountCredentials {

    userName("Aigerim"),
    lastName("Moldomusaeva"),
    userEmail("kurmalyyy@gmail.com"),
    userEmailWithoutUpperCaseToUse("aigerimka@gmail.com"),
    userInvalidEmail("mol"),
    userInvalidPasswordLetters("abcdefghijkl"),
    userInvalidPasswordDigits("123456789"),
    userInvalidPasswordWithoutUpperCase("aigerim123!"),
    userInvalidPasswordWithoutUpperCaseConf("aigerim123!"),
    userPassword("Aigerim99!"),
    confirmationPassword("Aigerim99!"),
    passwordConfError("jdkfdjfdh5625");


    @Getter

    String credential;

    LumaCreateAnAccountCredentials(String credential){
        this.credential=credential;
    }

}
