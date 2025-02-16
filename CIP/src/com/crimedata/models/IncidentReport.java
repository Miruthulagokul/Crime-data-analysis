package com.crimedata.models;

public class IncidentReport {

    private int reportId;
    private int crimeId;
    private String description;
    private String date;

    // Constructor
    public IncidentReport(int reportId, int crimeId, String description, String date) {
        this.reportId = reportId;
        this.crimeId = crimeId;
        this.description = description;
        this.date = date;
    }

    // Getters and Setters
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getCrimeId() {
        return crimeId;
    }

    public void setCrimeId(int crimeId) {
        this.crimeId = crimeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // toString method (optional but helpful for debugging)
    @Override
    public String toString() {
        return "IncidentReport [reportId=" + reportId + ", crimeId=" + crimeId + ", description=" + description + ", date=" + date + "]";
    }
}



