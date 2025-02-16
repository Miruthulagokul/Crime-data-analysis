package com.crimedata.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CrimeData {

    private StringProperty crimeType;
    private StringProperty crimeLocation;
    private StringProperty crimeDate;
    private StringProperty offenderName;
    private StringProperty caseID;
    private StringProperty caseStatus;

    public CrimeData(String crimeType, String crimeLocation, String crimeDate,
                     String offenderName, String caseID, String caseStatus) {
        this.crimeType = new SimpleStringProperty(crimeType);
        this.crimeLocation = new SimpleStringProperty(crimeLocation);
        this.crimeDate = new SimpleStringProperty(crimeDate);
        this.offenderName = new SimpleStringProperty(offenderName);
        this.caseID = new SimpleStringProperty(caseID);
        this.caseStatus = new SimpleStringProperty(caseStatus);
    }

    public String getCrimeType() {
        return crimeType.get();
    }

    public String getCrimeLocation() {
        return crimeLocation.get();
    }

    public String getCrimeDate() {
        return crimeDate.get();
    }

    public String getOffenderName() {
        return offenderName.get();
    }

    public String getCaseID() {
        return caseID.get();
    }

    public String getCaseStatus() {
        return caseStatus.get();
    }

    // Getters for properties to bind with TableView
    public StringProperty crimeTypeProperty() {
        return crimeType;
    }

    public StringProperty crimeLocationProperty() {
        return crimeLocation;
    }

    public StringProperty crimeDateProperty() {
        return crimeDate;
    }

    public StringProperty offenderNameProperty() {
        return offenderName;
    }

    public StringProperty caseIDProperty() {
        return caseID;
    }

    public StringProperty caseStatusProperty() {
        return caseStatus;
    }
}

