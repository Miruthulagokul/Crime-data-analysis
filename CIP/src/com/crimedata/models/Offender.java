package com.crimedata.models;

public class Offender {
    private int offenderId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int priorOffensesCount;
    private String riskLevel;
    private String lastArrestDate;

    // Constructors
    public Offender(int offenderId, String firstName, String lastName, int age, String gender, int priorOffensesCount, String riskLevel, String lastArrestDate) {
        this.offenderId = offenderId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.priorOffensesCount = priorOffensesCount;
        this.riskLevel = riskLevel;
        this.lastArrestDate = lastArrestDate;
    }

    // Getters and Setters
    public int getOffenderId() {
        return offenderId;
    }

    public void setOffenderId(int offenderId) {
        this.offenderId = offenderId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPriorOffensesCount() {
        return priorOffensesCount;
    }

    public void setPriorOffensesCount(int priorOffensesCount) {
        this.priorOffensesCount = priorOffensesCount;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getLastArrestDate() {
        return lastArrestDate;
    }

    public void setLastArrestDate(String lastArrestDate) {
        this.lastArrestDate = lastArrestDate;
    }
}






