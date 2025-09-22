/**
 * File: Lab02Prob01.java
 * Class: CSCI 1301
 * Author: Greg Lamar
 * Created on: Aug, 23, 2024
 * Last Modified: Aug 23, 2024
 * Description: Calculate age
 */

import java.util.Scanner;

public class Lab02Prob03 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter birth year: ");
		
		int birthYear = input.nextInt();

		System.out.print("Enter your age: ");
		
		int age = input.nextInt();
		
		System.out.println("You were born in " + birthYear + " and are " + age + " years old.");
		
		System.out.println("In 15 years, you will be " + (age + 15) + " years old.");
		
		System.out.println("Someone twice your age is " + (age * 2) + " years old.");
		
		System.out.println("Someone half your age is " + (age / 2.0) + " years old.");
		
						
	}
	
}
	

	