package com.jofer.javabackend.util;

public class Employer extends User {
    // Employer private class variables.
    String company;

    // Default Constructor
    public Employer() {
        company = "";
    }

    // Setter methods
    public void setCompany( String comp ) {
        company = comp;
    }

    // Getter methods
    public String getCompany() {
        return company;
    }

}
