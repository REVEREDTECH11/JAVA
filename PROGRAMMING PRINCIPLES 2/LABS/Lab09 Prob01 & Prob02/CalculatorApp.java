package com.example.lab09;


//package com.example.lab08prob02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Create TextFields
        TextField numField1 = new TextField();
        numField1.setPromptText("Enter first number");

        TextField numField2 = new TextField();
        numField2.setPromptText("Enter second number");

        TextField resultField = new TextField();
        resultField.setPromptText("Result");
        resultField.setEditable(false);

        //Create Buttons
        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");

        //Set button actions
        addButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                resultField.setText(String.valueOf(num1 + num2));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        });

        subtractButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                resultField.setText(String.valueOf(num1 - num2));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        });

        multiplyButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                resultField.setText(String.valueOf(num1 * num2));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        });

        divideButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                if (num2 != 0) {
                    resultField.setText(String.valueOf(num1 / num2));
                } else {
                    resultField.setText("Cannot divide by zero");
                }
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        });

        //Create GridPane for buttons
        GridPane gridPane = new GridPane();
        gridPane.add(addButton, 0, 0);
        gridPane.add(subtractButton, 1, 0);
        gridPane.add(multiplyButton, 0, 1);
        gridPane.add(divideButton, 1, 1);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        //Create HBox
        HBox hBox = new HBox(10, numField1, gridPane, numField2, resultField);

        //Set up the Scene and Stage
        Scene scene = new Scene(hBox, 500, 150);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}