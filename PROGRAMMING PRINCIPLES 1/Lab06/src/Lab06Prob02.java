
/**
* File: Lab06Prob02.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Oct, 8 2024
* Last Modified: Oct, 8 2024
* Description: Determine the max value from entered numbers.
*/
public class Lab06Prob02 {

	public static void main(String[] args) {
		
		long num = 0;
		
		for (int i = 5; i <= 250; i++) {
			
			num += Math.pow((2 * i + 1), 2);

		}
		
		System.out.printf("The sum is %,d\n", num);
			
		}
		

		

	
	public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
	}
}