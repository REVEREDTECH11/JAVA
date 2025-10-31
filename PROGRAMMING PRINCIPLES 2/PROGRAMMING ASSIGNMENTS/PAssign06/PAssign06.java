package com.example.passign06;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.GridPane;

import javafx.scene.control.Button;

import javafx.stage.Stage;

public class PAssign06 extends Application {

    @Override
    public void start(Stage primaryStage) {

        //Create a GridPane
        GridPane grid = new GridPane();

        grid.setStyle("-fx-background-color: #ff0000;");

        grid.setHgap(25);

        grid.setVgap(10);

        //Create buttons
        String[] keys = {
                "1", "2", "3",
                "4", "5", "6",
                "7", "8", "9",
                "*", "0", "#"
        };

        for (int i = 0; i < keys.length; i++) {

            Button button = new Button(keys[i]);

            button.setPrefSize(80, 80);

            int row = i / 3;

            int col = i % 3;

            grid.add(button, col, row);

        }

        //new scene
        Scene scene = new Scene(grid, 300, 400);

        primaryStage.setTitle("Phone Keypad");

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public static void main(String[] args) {

        launch(args);

    }

}
