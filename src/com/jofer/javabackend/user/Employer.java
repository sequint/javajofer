package com.jofer.javabackend.user;

import java.util.ArrayList;
import com.jofer.javabackend.job.Job;

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
