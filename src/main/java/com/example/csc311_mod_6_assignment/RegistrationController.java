package com.example.csc311_mod_6_assignment;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationController {

    // === Text Fields ===
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;
    @FXML private TextField dobField;
    @FXML private TextField zipCodeField;

    // === Buttons ===
    @FXML Button verifyButton;


    /**
     * Initializes listeners for all text fields to validate input live.
     * Allows for 'Enter' key pressed after zipcode field is completed
     *
     */
    @FXML
    public void initialize(){
        // Live Validation
        firstNameField.textProperty().addListener((obs, oldVal, newVal) -> validateFields());
        lastNameField.textProperty().addListener((obs, oldVal, newVal) -> validateFields());
        emailField.textProperty().addListener((obs, oldVal, newVal) -> validateFields());
        dobField.textProperty().addListener((obs, oldVal, newVal) -> validateFields());
        zipCodeField.textProperty().addListener((obs, oldVal, newVal) -> validateFields());

        // Trigger Verify button on Enter Key in Zipcode Field
        zipCodeField.setOnAction(event -> {
            if (!verifyButton.isDisabled()) {
                try {
                    onClickVerifyButton();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Validates all fields using regex and enables the Verify button if all fields are valid
     */
    private void validateFields(){
        boolean valid = isValidName(firstNameField.getText())
                && isValidName(lastNameField.getText())
                && isValidEmail(emailField.getText())
                && isValidDOB(dobField.getText())
                && isValidZip(zipCodeField.getText());

        verifyButton.setDisable(!valid); //Disable if invalid
    }

    // === Field Validation ===
    private boolean isValidName(String name){
        return name.matches("^[A-Za-z]{2,25}$");
    }

    private boolean isValidEmail(String email){
        return email.matches("^[a-zA-Z0-9._%+-]+@farmingdale\\.edu$");
    }

    private boolean isValidDOB(String dob){
        return dob.matches("^(0[1-9]|1[0-2])/([0-2][0-9]|3[01])/\\d{4}$");
    }

    private boolean isValidZip(String zipCode){
        return zipCode.matches("^\\d{5}$");
    }

    /**
     * Loads the success-view.fxml page when Verify button is clicked.
     *
     * @throws IOException if the FXML file is not found or can't be loaded
     * @since 1.0
     * @Author Justin Derenthal
     */
    @FXML
    private void onClickVerifyButton() throws IOException {
        if(verifyButton.isDisable()) return;

        // Load next screen
        Parent nextUI = FXMLLoader.load(getClass().getResource("success-view.fxml"));
        Stage stage = (Stage) verifyButton.getScene().getWindow();
        stage.setTitle("Good Job!");
        stage.setScene(new Scene(nextUI));
    }
    }
