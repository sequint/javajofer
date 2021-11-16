package com.jofer.javabackend.job;

import java.util.ArrayList;
import java.util.UUID;
import com.jofer.javabackend.user.Applicant;

public class Job {
    // Job class private variables
    String iD,
            title,
            department,
            employer;
    ArrayList<Applicant> applicants;

    // Default Constructor
    public Job() {
        iD = UUID.randomUUID().toString();
        title = "";
        department = "";
        employer = "";
        applicants = new ArrayList<>();
    }

    // Setter methods
    public void setTitle( String jobTitle ) {
        title = jobTitle;
    }
    public void setDepartment( String jobDepartment ) {
        department = jobDepartment;
    }
    public void setEmployer( String employerID ) {
        employer = employerID;
    }
    public void setApplicants( ArrayList<Applicant> aplcs ) {
        applicants = aplcs;
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
    public String getEmployer() {
        return employer;
    }
    public ArrayList<Applicant> getApplicants() {
        return applicants;
    }

}
