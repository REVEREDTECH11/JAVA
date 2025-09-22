
/**
* File: Lab06Prob03.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Oct, 11 2024
* Last Modified: Oct, 11 2024
* Description: Determine the max value from entered numbers.
*/
import java.util.Scanner;

public class Lab06Prob03 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		
		System.out.print("Enter Positive Number or 672 to end program: ");
		
		int value = input.nextInt();
		
		
		while (value != 672) {
			
			if (value > 0 && value % 2 == 0) {
				
				sum += value;
				count++;
				
			}
			System.out.print("Enter Positive Number or 672 to end program: ");
			value = input.nextInt();
		}
		
		if (count > 0) {
			double average = (double) sum / count;
			System.out.printf("For the positive, even numbers, the sum was %d and the average was %.4f\n", sum, average);
		} else {
			System.out.print("No allowed values entered.");
		}
	}
	
}