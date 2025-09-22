 
/**
* File: Lab08Prob02.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Oct, 25 2024
* Last Modified: Oct, 25 2024
* Description: Determine the average value from entered numbers.
*/
public class Lab08Prob02 {
//Declared class
    public static double average(int value1, int value2, int value3) {
        
        return (double) (value1 + value2 + value3) / 3;
    }

    public static double average(double value1, double value2, double value3) {
      
    	return (value1 + value2 + value3) / 3;
    	//returns value to be used later on
    }
    
    public static double average(int value1, int value2, int value3, int value4) {
        
        return (double) (value1 + value2 + value3 + value4) / 4;
    }
    
    public static double average(double value1, double value2, double value3, double value4) {
        
    	return (value1 + value2 + value3 + value4) / 4;
    }

    public static void main(String[] args) {
     //main class
    	int num1 = 2;
        int num2 = 3;
        int num3 = 6;
        double AvgVal= average(num1, num2, num3);
        System.out.printf("The average of %d, %d, and %d is %.5f\n", num1, num2, num3, AvgVal);
        //Print output to desired format
      
        double d1 = 2.74;
        double d2 = 3.45;
        double d3 = 6.21;
        double OvAverage1 = average(d1, d2, d3);
        System.out.printf("The average of %.2f, %.2f, and %.2f is %.5f\n", d1, d2, d3, 
        		OvAverage1);
        
    	int value1 = 2;
        int value2 = 3;
        int value3 = 6;
        //overloaded method
        int value4 = 11;
        double lAvgVal= average(value1, value2, value3, value4);
        System.out.printf("The average of %d, %d, %d, and %d is %.5f\n", value1, value2, value3, value4, lAvgVal);
        //Print output to desired format
      
        double Ov1 = 2.74;
        double Ov2 = 3.45;
        double Ov3 = 6.21;
        //overloaded method
        double d4 = 11.91;
        double OvAverage2 = average(d1, d2, d3, d4);
        System.out.printf("The average of %.2f, %.2f, %.2f, and %.2f is %.5f\n", d1, d2, d3, d4, OvAverage2);
    }
}