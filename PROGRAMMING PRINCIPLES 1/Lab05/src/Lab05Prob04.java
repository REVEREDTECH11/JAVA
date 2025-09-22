/**
* File: Labs05Prob01.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: sep 22, 2024
* Last Modified: SEP 22, 2024
* Description: Area of a triangle(with formatting)
*/

import java.util.Scanner;

public class Lab05Prob04 {
	
	public static void main(String[] args) {
		
		Scanner side = new Scanner(System.in);
		
		System.out.print("ENTER SIDE A: ");
	
		double a = side.nextDouble();
		
		System.out.print("ENTER SIDE B: ");
		
		double b = side.nextDouble();
	
		System.out.print("ENTER SIDE C: ");
		
		double c = side.nextDouble();
	
		double s = (a + b + c) / 2;
		//CALCULATE FOR THE AREA
		double Area = Math.sqrt( s * ( s - a) * ( s - b ) * ( s - c));
		//EDIT FORMAT OF NUMERICAL OUTPUT
		System.out.printf("For side lengths of %.2f, %.2f, %.2f, the area is %.2f" + ".", a, b, c , Area);
	}

}