package com.example.demo1;

/**
 * File: PAssign08.java
 * Class: CSCI 1302
 * Author: GREG LAMAR
 * Created on: 04/02/25
 * Last Modified: 04/02/25
 * Description: Create keypad
 */

//import java modules
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PAssign08 extends Application {

    @Override
    public void start(Stage primaryStage) {
        //CREATE CUSTOM KEYPAD
        KeyPadCustomPane keypad = new KeyPadCustomPane();

        //DISPLAY COMPONENTS
        Label displayLabel = new Label("Enter Code:");

        TextField displayField = new TextField();

        displayField.setEditable(false);

        displayField.setStyle("-fx-font-size: 30; -fx-font-family: 'Courier New';");

        displayField.setPromptText("Press buttons to enter code");

        VBox displayBox = new VBox(10, displayLabel, displayField);

        displayBox.setStyle("-fx-padding: 20; -fx-alignment: center;");

        ImageView safeImage = new ImageView(new Image("file:safe.png")); // Replace with actual image file

        safeImage.setFitWidth(150);

        safeImage.setFitHeight(150);


        //UNLOCK BUTTON
        Button unlockButton = new Button("Unlock");

        unlockButton.setStyle("-fx-font-size: 30; -fx-background-color: #ff0000; -fx-text-fill: white;");

        unlockButton.setOnAction(e -> {

            String enteredCode = displayField.getText();

            if (enteredCode.equals("8592")) {

                System.out.println("Safe unlocked!");

                displayField.setStyle("-fx-background-color: #ff011f;");

                displayField.setText("Unlocked!");

            } else {

                System.out.println("Incorrect code.");

                displayField.setStyle("-fx-background-color: pink;");

                displayField.setText("Try Again!");
            }
        });

        VBox bottomBox = new VBox(10, safeImage, unlockButton);

        bottomBox.setStyle("-fx-padding: 20; -fx-alignment: center;");

        BorderPane root = new BorderPane();

        root.setTop(displayBox);

        root.setCenter(keypad);

        root.setBottom(bottomBox);

        Scene scene = new Scene(root, 300, 500);

        primaryStage.setTitle("Safe Keypad Simulator");

        primaryStage.setScene(scene);

        primaryStage.show();

        keypad.registerEventHandlers(new EventHandler<ActionEvent>() {

            @Override

            public void handle(ActionEvent e) {

                String buttonValue = ((Button) e.getSource()).getText();

                if (buttonValue.equals("C")) {

                    displayField.clear(); // Clear the display on "C"

                    displayField.setStyle("-fx-background-color: white;");

                } else {

                    displayField.appendText(buttonValue); // Append number to the display

                }

            }

        });

    }

    public static void main(String[] args) {

        launch(args);

    }

}