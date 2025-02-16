package com.crimedata.controllers;

import com.crimedata.models.Offender;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class OffenderProfilesController {

    @FXML
    private TableView<Offender> offenderTable;

    @FXML
    private TableColumn<Offender, Integer> offenderIdColumn;
    @FXML
    private TableColumn<Offender, String> firstNameColumn;
    @FXML
    private TableColumn<Offender, String> lastNameColumn;
    @FXML
    private TableColumn<Offender, Integer> ageColumn;
    @FXML
    private TableColumn<Offender, String> genderColumn;
    @FXML
    private TableColumn<Offender, Integer> priorOffensesCountColumn;
    @FXML
    private TableColumn<Offender, String> riskLevelColumn;
    @FXML
    private TableColumn<Offender, String> lastArrestDateColumn;

    @FXML
    private TextField nameField;
    @FXML
    private TextField riskLevelField;

    private ObservableList<Offender> offenderList;

    // Initialize method to set up table columns and load data
    public void initialize() {
        offenderList = FXCollections.observableArrayList();
        offenderTable.setItems(offenderList);

        // Set up table columns
        offenderIdColumn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getOffenderId()).asObject());
        firstNameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFirstName()));
        lastNameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getLastName()));
        ageColumn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getAge()).asObject());
        genderColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getGender()));
        priorOffensesCountColumn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getPriorOffensesCount()).asObject());
        riskLevelColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getRiskLevel()));
        lastArrestDateColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getLastArrestDate()));
    }

    // Action for the "Add Offender" button
    @FXML
    public void addOffender() {
        String firstName = nameField.getText();
        String riskLevel = riskLevelField.getText();

        if (firstName.isEmpty() || riskLevel.isEmpty()) {
            showErrorDialog("Form Error", "Please fill out all fields.");
            return;
        }

        // Sample data for the new offender
        int offenderId = offenderList.size() + 1; // Auto-increment offender ID
        String lastName = "Doe"; // Use default last name for simplicity
        int age = 30; // Placeholder age
        String gender = "M"; // Placeholder gender
        int priorOffensesCount = 0; // Placeholder for prior offenses
        String lastArrestDate = "N/A"; // Placeholder for last arrest date

        // Create a new offender object
        Offender newOffender = new Offender(offenderId, firstName, lastName, age, gender, priorOffensesCount, riskLevel, lastArrestDate);

        // Add the new offender to the list and refresh the table
        offenderList.add(newOffender);

        // Clear the input fields
        nameField.clear();
        riskLevelField.clear();
    }

    // Method to show error dialog
    private void showErrorDialog(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}






