package com.jofer.javabackend.util;

import java.util.ArrayList;

public class Applicant extends User {
    // Applicant private class variables.
    ArrayList<Job> appliedJobs;

    // Default Constructor
    public Applicant() {
        appliedJobs = new ArrayList<>();
    }

    // Setter methods
    public void setAppliedJobs( ArrayList<Job> jobs ) {
        appliedJobs = jobs;
    }

    // Methods to add a new job to applied jobs list.
    public void addAppliedJob( Job job ) {
        appliedJobs.add( job );
    }

    // Getter methods
    public ArrayList<Job> getAppliedJobs() {
        return appliedJobs;
    }

}
