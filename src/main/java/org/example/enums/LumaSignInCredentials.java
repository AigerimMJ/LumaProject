package org.example.enums;

import lombok.Getter;

public enum LumaSignInCredentials {

    userEmailToSign("moldomusaeva@gmail.com"),
    userEmailToSignNew("moldomusaevaa@gmail.com"),
    userPasswordToSign("Aigerim99!"),
    invalidEmailToSign("jigit@gmail.com"),
    invalidPasswordToSign("123456");
    @Getter

    String credential;
    LumaSignInCredentials(String credential) {
        this.credential=credential;
    }
    }

