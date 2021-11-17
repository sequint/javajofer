package com.jofer.javabackend.util;

import java.util.ArrayList;
import java.util.UUID;

public class Job {
    // Job class private variables
    private String iD;
    private String title;
    private String department;
    private Employer employer;
    private ArrayList<Applicant> applicants;

    // Default Constructor
    public Job() {
        iD = UUID.randomUUID().toString();
        employer = new Employer();
        applicants = new ArrayList<>();
    }

    // Setter methods
    public void setTitle( String title ) {
        this.title = title;
    }
    public void setDepartment( String department ) {
        this.department = department;
    }
    public void setEmployer( Employer employer ) {
        this.employer = employer;
    }
    public void setApplicants( ArrayList<Applicant> applicants ) {
        this.applicants = applicants;
    }

    // Add one applicant.
    public void addOneApplicant( Applicant applicant ) {
        this.applicants.add( applicant );
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
