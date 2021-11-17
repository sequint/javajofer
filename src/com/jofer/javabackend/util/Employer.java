package com.jofer.javabackend.util;

public class Employer extends User {
    // Employer private class variables.
    private String company;

    // Default Constructor
    public Employer() {
    }

    // Setter methods
    public void setCompany( String company ) {
        this.company = company;
    }

    // Getter methods
    public String getCompany() {
        return company;
    }

}
