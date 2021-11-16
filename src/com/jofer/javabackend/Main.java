package com.jofer.javabackend;

import com.jofer.javabackend.job.*;
import com.jofer.javabackend.user.*;

// Currently testing in terminal basic functionality of Jofer GUI.
public class Main {

    public static void main( String[] args ) {

        // Create a new employer.
        Employer nextEmployer = new Employer();

        // Set all variables for the new employer.
        nextEmployer.setFirstName("Debbie");
        nextEmployer.setLastName("Armstrong");
        nextEmployer.setUsername("debbie.armstrong@gmail.com");
        nextEmployer.setCompany("Google");

        // Print current variables for the employer.
        System.out.println(nextEmployer.getiD());
        System.out.println(nextEmployer.getFirstName());
        System.out.println(nextEmployer.getLastName());
        System.out.println(nextEmployer.getUsername());
        System.out.println(nextEmployer.getCompany());

        // Create a new applicant
        Applicant nextApplicant = new Applicant();

        // Set applicant variables.
        nextApplicant.setFirstName("Andrew");
        nextApplicant.setLastName("Rodriguez");
        nextApplicant.setUsername("a.r@gmail.com");

        // Print current variables for the applicant.
        System.out.println(nextApplicant.getiD());
        System.out.println(nextApplicant.getFirstName());
        System.out.println(nextApplicant.getLastName());
        System.out.println(nextApplicant.getUsername());

        // Create a new job.
        Job nextJob = new Job();

        nextJob.setTitle("Software Engineer");
        nextJob.setDepartment("Engineering");
        nextJob.setEmployer(nextEmployer);
        nextJob.addOneApplicant(nextApplicant);

        // Print job information
        System.out.println(nextJob.getTitle());
        System.out.println(nextJob.getDepartment());
        System.out.println(nextJob.getEmployer());
        System.out.println(nextJob.getApplicants());

    }
}
