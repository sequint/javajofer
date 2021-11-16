package com.jofer.javabackend.job;

import java.util.UUID;

public class Job {
    // Job class private variables
    String iD,
            title,
            company,
            department;

    // Default Constructor
    public Job() {
        iD = UUID.randomUUID().toString();
        title = "";
        company = "";
        department = "";
    }

    // Setter methods
    public void setTitle( String jobTitle ) {
        title = jobTitle;
    }
    public void setCompany( String jobCompany ) {
        company = jobCompany;
    }
    public void setDepartment( String jobDepartment ) {
        department = jobDepartment;
    }

}
