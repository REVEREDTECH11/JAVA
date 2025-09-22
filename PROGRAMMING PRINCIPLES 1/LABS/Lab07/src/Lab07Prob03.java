/**
* File: Lab07Prob03.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Oct 11, 2024
* Last Modified: Oct 11, 2024
* Description: Using nested for loops
*/
public class Lab07Prob03 {
	public static void main(String[] args) {
		
		double x = Math.PI / 6;
		
		double Cos = 0.0;
		
		for (int i = 0; i <= 7; i++) {
			
			Cos += Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i);
			
		}
		
		double Cosine = Math.cos(x);
		
		System.out.printf("Actual Cos (PI/6): %.16f%n", Cosine);
        System.out.printf("Approx Cos (PI/6): %.16f%n", Cos);
		
	}
	
	public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
	}
}


