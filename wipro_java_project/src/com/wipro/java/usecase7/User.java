package com.wipro.java.usecase7;

class User {
    private String name;
    private String jobTitle;
    private String company;
    private boolean isConnected;

    // Constructor to initialize user details
    public User(String name, String jobTitle, String company, boolean isConnected) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.company = company;
        this.isConnected = isConnected;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public boolean isConnected() {
        return isConnected;
    }

    // Method to display user details
    public void displayUser() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Company: " + company);
        System.out.println("Connection Status: " + (isConnected ? "Connected" : "Not Connected"));
        System.out.println("------------------------------------");
    }
}