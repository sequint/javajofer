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
        applicantsCounter = 0.00;
        employersCounter = 0.00;
        finalSalary = 0.00;
    }

}
