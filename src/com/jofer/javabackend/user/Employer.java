package com.jofer.javabackend.user;

import java.util.Vector;

public class Employer extends User {
    // Create unique attributes for Employer class.
    String company;
    // Create a vector for posted jobs.

    // Default Constructor
    public Employer() {
        company = "";
    }

    // Setter methods
    public void setCompany( String comp ) { company = comp; }

    // Getter methods
    public String getCompany() { return company; }

}
