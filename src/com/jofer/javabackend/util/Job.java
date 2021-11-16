package com.jofer.javabackend.util;

import java.util.ArrayList;
import java.util.UUID;

public class Job {
    // Job class private variables
    String iD,
            title,
            department;
    Employer employer;
    ArrayList<Applicant> applicants;

    // Default Constructor
    public Job() {
        iD = UUID.randomUUID().toString();
        title = "";
        department = "";
        employer = new Employer();
        applicants = new ArrayList<>();
    }

    // Setter methods
    public void setTitle( String jobTitle ) {
        title = jobTitle;
    }
    public void setDepartment( String jobDepartment ) {
        department = jobDepartment;
    }
    public void setEmployer( Employer employ ) {
        employer = employ;
    }
    public void setApplicants( ArrayList<Applicant> aplcs ) {
        applicants = aplcs;
    }

    // Add one applicant.
    public void addOneApplicant( Applicant applicant ) {
        applicants.add( applicant );
    }

    // Getter methods
    public String getiD() {
        return iD;
    }
    public String getTitle() {
        return title;
    }
    public String getDepartment() {
        return department;
    }
    public Employer getEmployer() {
        return employer;
    }
    public ArrayList<Applicant> getApplicants() {
        return applicants;
    }

}
