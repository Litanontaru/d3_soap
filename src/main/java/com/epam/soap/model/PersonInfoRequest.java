package com.epam.soap.model;

/**
 * @author Andrei_Yakushin
 * @since 7/25/2016 9:37 AM
 */
public class PersonInfoRequest {
    private String name;
    private String surname;

    public PersonInfoRequest() {
    }

    public PersonInfoRequest(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
