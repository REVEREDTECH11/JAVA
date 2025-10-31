package com.example.lab09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FuelEfficiencyCalculator extends Application {
    @Override
    public void start(Stage primaryStage) {

        Label milesLabel = new Label("Miles:");
        Label gallonsLabel = new Label("Gallons:");
        Label mpgLabel = new Label("MPG:");

        //Create TextBoxes
        TextField milesTextBox = new TextField();
        TextField gallonsTextBox = new TextField();
        TextField mpgTextBox = new TextField();
        mpgTextBox.setEditable(false);

        //Create Buttons
        Button calculateButton = new Button("Calculate");
        Button resetButton = new Button("Reset");

        //Define GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.add(milesLabel, 0, 0);
        gridPane.add(milesTextBox, 1, 0);
        gridPane.add(gallonsLabel, 0, 1);
        gridPane.add(gallonsTextBox, 1, 1);
        gridPane.add(mpgLabel, 0, 2);
        gridPane.add(mpgTextBox, 1, 2);
        gridPane.add(calculateButton, 0, 3);
        gridPane.add(resetButton, 1, 3);

        //Set up Scene
        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fuel Efficiency Calculator");
        primaryStage.show();

        //Button Actions
        calculateButton.setOnAction(e -> {
            try {
                double miles = Double.parseDouble(milesTextBox.getText());
                double gallons = Double.parseDouble(gallonsTextBox.getText());
                if (gallons != 0) {
                    double mpg = miles / gallons;
                    mpgTextBox.setText(String.format("%.2f", mpg));
                } else {
                    mpgTextBox.setText("Cannot divide by zero!");
                }
            } catch (NumberFormatException ex) {
                mpgTextBox.setText("Invalid Input");
            }
        });

        resetButton.setOnAction(e -> {
            milesTextBox.clear();
            milesTextBox.setText("0");
            gallonsTextBox.clear();
            gallonsTextBox.setText("0");
            mpgTextBox.clear();
            mpgTextBox.setText("0");
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
