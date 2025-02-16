package com.crimedata.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import java.io.IOException;

public class MainController {

    @FXML
    private Pane contentPane; // This is the container where pages will load dynamically

    // Method to load a page into the content pane
    private void loadPage(String fxmlFile) {
        try {
            // Load the specified FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/crimedata/views/" + fxmlFile));
            Parent root = loader.load();

            // Clear existing content and set the new content
            contentPane.getChildren().clear();
            contentPane.getChildren().add(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Event handler for loading the Dashboard page
    @FXML
    private void handleDashboard() {
        loadPage("Dashboard.fxml");
    }

    // Event handler for loading the Crime Records page
    @FXML
    private void handleCrimeRecords() {
        loadPage("CrimeRecords.fxml");
    }

    // Event handler for loading the Offender Profiles page
    @FXML
    private void handleOffenderProfiles() {
        loadPage("OffenderProfiles.fxml");
    }

    // Event handler for loading the Incident Reports page
    @FXML
    private void handleIncidentReports() {
        loadPage("IncidentReports.fxml");
    }

    // Event handler for loading the Analytics page
    @FXML
    private void handleAnalytics() {
        loadPage("Analytics.fxml");
    }
}
