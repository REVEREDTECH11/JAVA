/**
* File: Lab09Prob02.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Nov, 1 2024
* Last Modified: Nov, 1 2024
* Description: Arrays
*/


public class Lab09Prob02 {
    
    public static void main(String[] args) {
        
       //Array
        double[] values = {
            -12.6018020118, 15.3437682821, 145.8110691671, 11.1681119916, 82.0442710394,
            155.0005475009, -6.1179400421, 120.1984991874, 38.6575114628, 77.1494972203
        };
        
       //for loop
        for (int i = 0; i < values.length; i++) {
            System.out.printf("Index %d of %d: %.5f%n", i, values.length - 1, values[i]);
        }
        System.out.println("");
        
        
        double maximum = values[0];
        int maxIndex = 0;
        for (int num = 1; num < values.length; num++) {
            if (values[num] > maximum) {
                maximum = values[num];
                maxIndex = num;
            }
        }
        System.out.printf("Maximum Value: %.5f at index %d%n", maximum, maxIndex);
    }
}
