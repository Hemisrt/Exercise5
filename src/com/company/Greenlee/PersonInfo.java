package com.company.Greenlee;

public class PersonInfo {
    // Name and Email Attributes
    private String name;
    private String email;

    // Methods
    // Default Constructor
    public PersonInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString() method
    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}