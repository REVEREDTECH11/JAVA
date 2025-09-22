 
/**
* File: Lab08Prob01.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Oct, 25 2024
* Last Modified: Oct, 25 2024
* Description: Determine the average value from entered numbers.
*/
public class Lab08Prob01 {
//Declared public class
    public static double average(int value1, int value2, int value3) {
        
        return (double) (value1 + value2 + value3) / 3;
    }

    public static double average(double value1, double value2, double value3) {
      
    	return (value1 + value2 + value3) / 3;
    	//returns value to be used later on
    }

    public static void main(String[] args) {
     //main class
        int value1 = 2;
        int value2 = 3;
        int value3 = 6;
        double AvgVal= average(value1, value2, value3);
        System.out.printf("The average of %d, %d, and %d is %.5f\n", value1, value2, value3, AvgVal);
        //Print output to desired format
      
        double d1 = 2.74;
        double d2 = 3.45;
        double d3 = 6.21;
        double doubleAverage = average(d1, d2, d3);
        System.out.printf("The average of %.2f, %.2f, and %.2f is %.5f\n", d1, d2, d3, doubleAverage);
    }
}