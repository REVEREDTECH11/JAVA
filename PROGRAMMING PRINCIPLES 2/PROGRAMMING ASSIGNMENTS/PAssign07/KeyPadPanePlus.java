/**
 * File: csci1302/keypad/KeyPadPanePlus.java
 * Package: keypad
 * @author Lamar, Greg
 * Created on: 04/03/25
 * Description:  Small example of extending the KeyPadPane class
 * 		and accessing a protected data member within that class
 */
package org.example.passing07;

import javafx.scene.control.Button;

public class KeyPadPanePlus extends KeyPadPane {
	public KeyPadPanePlus() {
		super();

		//ERASE LAYOUT IN KeyPadPane
		this.getChildren().clear();

		//BUTTON ORDER
		this.add(btn7, 0, 0);
		this.add(btn8, 1, 0);
		this.add(btn9, 2, 0);
		this.add(btn4, 0, 1);
		this.add(btn5, 1, 1);
		this.add(btn6, 2, 1);
		this.add(btn1, 0, 2);
		this.add(btn2, 1, 2);
		this.add(btn3, 2, 2);
		this.add(btnAsterisk, 0, 3); // Add asterisk (*) to the bottom-left
		this.add(btn0, 1, 3);        // Add 0 to the bottom-center
		this.add(btnPound, 2, 3);

		//MAKE BUTTONS RED WITH BLACK SYMBOLS
		this.getChildren().forEach(node -> {
			if (node instanceof Button) {
				Button button = (Button) node;
				//SET COLOR
				button.setStyle("-fx-background-color: red; -fx-text-fill: #000000; -fx-font-size: 50px;");
				//SET SIZE
				button.setPrefSize(200, 200);
				//button.setOnAction(e -> System.out.println("Stop that!"));
				//OUTPUT IF BUTTON IS PRESSED
				button.setOnAction(e -> System.out.println("Stop that! Button Pressed: " + button.getText()));
			}
		});







	}
}

