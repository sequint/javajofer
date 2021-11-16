package com.jofer.javabackend.job;

public class Job {
    // Job class private variables
    String title,
            company,
            department;

    // Default Constructor
    public Job() {
        title = "";
        company = "";
        department = "";
    }

    // Setter methods
    public void setTitle( String jobTitle ) { title = jobTitle; }
    public void setCompany( String jobCompany ) { company = jobCompany; }
    public void setDepartment( String jobDepartment ) { department = jobDepartment; }

}
