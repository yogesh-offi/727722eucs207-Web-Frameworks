package com.day4q2.day4q2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int jobId;
    public String JobTitle;
    public int minSalary;
    public String jobDescription;
    public int maxSalary;
    public int getJobId() {
        return jobId;
    }
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
    public String getJobTitle() {
        return JobTitle;
    }
    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }
    public int getMinSalary() {
        return minSalary;
    }
    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }
    public String getJobDescription() {
        return jobDescription;
    }
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    public int getMaxSalary() {
        return maxSalary;
    }
    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }
}
