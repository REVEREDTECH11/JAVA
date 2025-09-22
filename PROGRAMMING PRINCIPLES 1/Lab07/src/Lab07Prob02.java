/**
* File: Lab07Prob02.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Oct 11, 2024
* Last Modified: Oct 11, 2024
* Description: Using nested for loops
*/
import java.util.Scanner;

public class Lab07Prob02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int Number = 0;
		System.out.print("Enter a number: ");
		Number = input.nextInt();
		for (int i = 0; i < Number; i++) {
			
			if (i != 3 && i != 7 && i != 18 && i != 23 && i != 25) {
				
				System.out.printf("%d ", i);
			}
		}
		System.out.printf("%nYou entered %d%n", Number);
		
		System.out.println("Program Completed");	
	}
	
}

