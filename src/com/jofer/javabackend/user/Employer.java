package com.jofer.javabackend.user;

import java.util.ArrayList;
import java.util.HashMap;
import com.jofer.javabackend.job.Job;

public class Employer extends User {
    // Create unique attributes for Employer class.
    String company;
    ArrayList<Job> postedJobs;

    // Default Constructor
    public Employer() {
        company = "";
        postedJobs = new ArrayList<>();
    }

    // Setter methods
    public void setCompany( String comp ) {
        company = comp;
    }
    public void setPostedJobs( ArrayList<Job> jobs ) {
        postedJobs = jobs;
    }

    // Add a new job to the current posted jobs list.
    public void addPostedJob( Job job ) {
        postedJobs.add( job );
    }

    // Getter methods
    public String getCompany() {
        return company;
    }
    public ArrayList<Job> getPostedJobs() {
        return postedJobs;
    }
}
