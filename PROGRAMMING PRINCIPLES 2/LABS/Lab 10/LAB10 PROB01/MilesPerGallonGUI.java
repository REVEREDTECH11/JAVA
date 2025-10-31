package com.example.demo;

/**
 * File: ch15/MilesPerGallonGUI.java
 * Class: CSCI 1302
 * @author Christopher Williams
 * Created on: July 16, 2018
 * Last Modified: April 15, 2019
 * Description: JavaFX GUI miles per gallon calculator
 */


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MilesPerGallonGUI extends Application {
	private TextField tfMiles = new TextField();
	private TextField tfGallons = new TextField();
	private TextField tfFuel = new TextField(); // Renamed for clarity
	private TextField tfResult = new TextField(); // Generic result field
	private Button btCalculate = new Button("Calculate");
	private Button btReset = new Button("Reset");
	private RadioButton RadioMPG = new RadioButton("Miles Per Gallon (MPG)");
	private RadioButton RadioLPer100KM = new RadioButton("Liters per 100 KM (L/100KM)");
	private ToggleGroup tgUnit = new ToggleGroup();
	private Label lblDistance = new Label("Miles:");
	private Label lblFuelConsumed = new Label("Gallons:");
	private Label lblEfficiency = new Label("Miles Per Gallon:");

	@Override
	public void start(Stage primaryStage) {
		// Create UI elements
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setHgap(5);
		gridPane.setVgap(5);

		String paneRedStyle = "-fx-background-color: black;";
		gridPane.setStyle(paneRedStyle);
		String redStyle = "-fx-background-color: red;";
		String radioButtonBlueStyle = "-fx-text-fill: blue; -fx-mark-color: blue;";
		btCalculate.setStyle(redStyle);
		btReset.setStyle(redStyle);
		RadioMPG.setStyle(radioButtonBlueStyle);
		RadioLPer100KM.setStyle(radioButtonBlueStyle);

		String textFieldYellowStyle = "-fx-background-color: yellow;";
		tfMiles.setStyle(textFieldYellowStyle);
		tfGallons.setStyle(textFieldYellowStyle);
		tfResult.setStyle(textFieldYellowStyle);



		//add radiobuttons
		gridPane.add(RadioMPG, 0, 0, 2, 1);
		gridPane.add(RadioLPer100KM, 0, 1, 2, 1);

		// Add labels and text fields
		gridPane.add(lblDistance, 0, 2);
		gridPane.add(tfMiles, 1, 2);
		gridPane.add(lblFuelConsumed, 0, 3);
		gridPane.add(tfGallons, 1, 3);
		gridPane.add(lblEfficiency, 0, 4);
		gridPane.add(tfResult, 1, 4);
		gridPane.add(btCalculate, 2, 5);
		gridPane.add(btReset, 2, 6);

		//set ui properties
		gridPane.setAlignment(Pos.CENTER);
		tfMiles.setAlignment(Pos.BOTTOM_RIGHT);
		tfGallons.setAlignment(Pos.BOTTOM_RIGHT);
		tfFuel.setAlignment(Pos.BOTTOM_RIGHT);
		tfResult.setAlignment(Pos.BOTTOM_RIGHT);
		tfResult.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.LEFT);
		GridPane.setHalignment(btReset, HPos.RIGHT);

		//make button pressable
		RadioMPG.setToggleGroup(tgUnit);
		RadioLPer100KM.setToggleGroup(tgUnit);
		RadioMPG.setSelected(true); // Default selection

		RadioMPG.setOnAction(e -> updateLabels());
		RadioLPer100KM.setOnAction(e -> updateLabels());

		btCalculate.setOnAction(e -> calculateEfficiency());

		btReset.setOnAction(e -> resetFields());

		//Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 400, 250);
		primaryStage.setTitle("Fuel Efficiency Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();

		updateLabels();
	}

	private void resetFields() {
		tfMiles.setText("0");
		tfGallons.setText("0");
		tfFuel.setText("0");
		tfResult.setText("");
	}

	private void updateLabels() {
		if (RadioMPG.isSelected()) {
			lblDistance.setText("Miles:");
			lblFuelConsumed.setText("Gallons:");
			lblEfficiency.setText("Miles Per Gallon:");
			// Ensure the correct input fields are visible/used
			lblDistance.setVisible(true);
			tfMiles.setVisible(true);
			lblFuelConsumed.setVisible(true);
			tfGallons.setVisible(true);
			lblEfficiency.setText("Miles Per Gallon:");
		} else {
			lblDistance.setText("Kilometers:");
			lblFuelConsumed.setText("Liters:");
			lblEfficiency.setText("Liters per 100 KM:");
			// Ensure the correct input fields are visible/used
			lblDistance.setVisible(true);
			tfMiles.setVisible(true);
			lblFuelConsumed.setVisible(true);
			tfGallons.setVisible(true);
			lblEfficiency.setText("Liters per 100 KM:");
		}
		tfResult.setText("");
	}

	private void calculateEfficiency() {
		if (RadioMPG.isSelected()) {
			calculateMPG();
		} else {
			calculateLPer100KM();
		}
	}

	private void calculateMPG() {
		if (tfMiles.getText() != null && !tfMiles.getText().isEmpty() &&
				tfGallons.getText() != null && !tfGallons.getText().isEmpty()) {
			try {
				double miles = Double.parseDouble(tfMiles.getText());
				double gallons = Double.parseDouble(tfGallons.getText());
				if (gallons == 0) {
					tfResult.setText("Cannot divide by zero");
					return;
				}
				double mpg = miles / gallons;
				tfResult.setText(String.format("%.2f", mpg));
			} catch (NumberFormatException e) {
				tfResult.setText("Invalid input");
			}
		} else {
			tfResult.setText("Enter miles and gallons");
		}
	}

	private void calculateLPer100KM() {
		if (tfMiles.getText() != null && !tfMiles.getText().isEmpty() &&
				tfGallons.getText() != null && !tfGallons.getText().isEmpty()) {
			try {
				double kilometers = Double.parseDouble(tfMiles.getText());
				double liters = Double.parseDouble(tfGallons.getText());
				if (kilometers == 0) {
					tfResult.setText("Cannot divide by zero");
					return;
				}
				double lPer100km = (liters / kilometers) * 100;
				tfResult.setText(String.format("%.2f", lPer100km));
			} catch (NumberFormatException e) {
				tfResult.setText("Invalid input");
			}
		} else {
			tfResult.setText("Enter kilometers and liters");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}