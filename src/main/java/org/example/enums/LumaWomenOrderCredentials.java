package org.example.enums;

import lombok.Getter;

public enum LumaWomenOrderCredentials {

    womenEmailAddress("moldomusaevaaika@gmail.com"),
    womenFirstName("Aika"),
    womenLastName("Moldomusaeva"),
    womenCompany("Google"),
    womenAddress("Chodronova 13"),
    womenCity("Bishkek"),
    womenZipCode("10001"),
    womenPhoneNumber("0709992666");

    @Getter
    String credentials;

    LumaWomenOrderCredentials(String credentials) {
        this.credentials = credentials;
    }
}
