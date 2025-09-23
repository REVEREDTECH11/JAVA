/**
* File: PAssign01b.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: sep 6, 2024
* Last Modified: Nov 26, 2024
* Description:
*/
import java.util.Scanner;
//import scanner
public class PAssign01b {
	
	public static void main(String[] args) {
		//new scanner
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("What is the height of the triangle ");
			//variable for height
			Double height = scanner.nextDouble();
			
			System.out.print("What the base length of the triangle ");
			//variable for base
			double base = scanner.nextDouble();
			//variable for calculating area
			double area = ((height * base) / 2);
			
			System.out.println("A triangle with base " + height  + " and height " + base + " has an area of " + area + ".");
		}
	}

}
