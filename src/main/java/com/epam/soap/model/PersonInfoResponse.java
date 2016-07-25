package com.epam.soap.model;

/**
 * @author Andrei_Yakushin
 * @since 7/25/2016 9:38 AM
 */
public class PersonInfoResponse {
    private String name;
    private String surname;
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
