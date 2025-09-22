/**
* File: Labs05Prob01.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: SEP 22, /2024
* Last Modified: SEP 22, 2024
* Description: Area of a triangle
*/

import java.util.Scanner;




public class Lab05Prob01 {
	
	public static void main(String[] args) {
		
		Scanner side = new Scanner(System.in);
		
		System.out.print("ENTER SIDE A: ");
	
		double a = side.nextDouble();
		
		System.out.print("ENTER SIDE B: ");
		
		double b = side.nextDouble();
	
		System.out.print("ENTER SIDE C: ");
		
		double c = side.nextDouble();
	
		double s = (a + b + c) / 2;
	
		double Area = Math.sqrt( s * ( s - a) * ( s - b ) * ( s - c));
		
		System.out.print("For side lengths of " + a + ", " + b + ", " + c + ", the area is " + Area + ".");
	
	}

}