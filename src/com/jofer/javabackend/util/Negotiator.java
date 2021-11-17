package com.jofer.javabackend.util;

import com.jofer.javabackend.util.Job;

public class Negotiator {
    // Private class variables
    private Job job;
    private Applicant applicant;
    private boolean jobOffered;
    private boolean applicantCountered;
    private boolean employerCountered;
    private boolean applicantAcceptedOffer;
    private boolean employerAcceptedOffer;
    private boolean applicantDeclinedOffer;
    private boolean employerDeclinedOffer;
    private double initialOffer;
    private double applicantsCounter;
    private double employersCounter;
    private double finalSalary;

    // Default Constructor
    public Negotiator() {
        job = new Job();
        applicant = new Applicant();
        jobOffered = false;
        applicantCountered = false;
        employerCountered = false;
        applicantAcceptedOffer = false;
        employerAcceptedOffer = false;
        applicantDeclinedOffer = false;
        employerDeclinedOffer = false;
        initialOffer = 0.00;
        applicantsCounter = 0.00;
        employersCounter = 0.00;
        finalSalary = 0.00;
    }

    // Setter methods for job and applicant objects.
    public void setJob( Job job ) {
        this.job = job;
    }
    public void setApplicant( Applicant applicant ) {
        this.applicant = applicant;
    }

    // Handle an initial offer.
    public void setInitialOffer( double initialOffer ) {
        this.initialOffer = initialOffer;
        this.jobOffered = true;
    }

    // Handle counter offer.
    public void handleCounterOffer( double counter, String user ) {

        // If the user is an applicant set applicant variables, otherwise set employer variables.
        if ( user.equals("applicant") ) {
            this.applicantsCounter = counter;
            this.applicantCountered = true;
            this.employerCountered = false;
        }
        else if ( user.equals("employer") ) {
            this.employersCounter = counter;
            this.employerCountered = true;
            this.applicantCountered = false;
        }
        else {
            System.out.println("Invalid user");
        }

    }

    // Handle offer accepted.

}
