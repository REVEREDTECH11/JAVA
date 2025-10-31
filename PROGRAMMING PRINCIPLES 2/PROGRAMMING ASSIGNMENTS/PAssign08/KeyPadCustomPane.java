package com.example.demo1;

/**
 * File: KeyPadCustomPane.java
 * Class: CSCI 1302
 * Author: GREG LAMAR
 * Created on: 04/02/25
 * Last Modified: 04/02/25
 * Description: Create keypad
 */

//import java modules
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


// Custom KeyPad class with added functionality
public sealed class KeyPadCustomPane extends KeyPadPane permits KeyPadCustomPaneImpl {

    public KeyPadCustomPane() {

        super(false); // Use default layout

        customizeButtons();
    }

    private void customizeButtons() {
        // Add custom styles and functionality
        listButtons.forEach(btn -> btn.setStyle("-fx-font-size: 15; -fx-background-color: #ffffff;"));

        btnBlank1.setText("C"); // Set first blank button as "Clear"

        btnBlank1.setStyle("-fx-background-color: #ff0000; -fx-font-weight: bold;");

        btnBlank2.setVisible(false); // Hide the second blank button
    }

    @Override
    protected void registerEventHandlers(EventHandler<ActionEvent> customHandler) {

        listButtons.forEach(btn -> btn.setOnAction(customHandler));
    }
}
