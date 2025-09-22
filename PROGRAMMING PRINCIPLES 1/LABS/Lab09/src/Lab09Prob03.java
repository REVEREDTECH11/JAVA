/**
* File: Lab09Prob03.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Nov, 1 2024
* Last Modified: Nov, 1 2024
* Description: Arrays
*/

import java.util.Arrays;

public class Lab09Prob03 {
    
    public static void main(String[] args) {
        //array
        double[] values = {
            -12.6018020118, 15.3437682821, 145.8110691671, 11.1681119916, 82.0442710394,
            155.0005475009, -6.1179400421, 120.1984991874, 38.6575114628, 77.1494972203
        };
        //initialization
        double minimum = values[0];
        double maximum = values[0];
        double sum = 0.0;
        
        for (double value : values) {
            if (value < minimum) {
                minimum = value;
            }
            if (value > maximum) {
                maximum = value;
            }
            sum += value;
        }
        
        
        //outputs
        System.out.printf("Maximum value: %.3f%n", maximum);
        System.out.printf("Minimum value: %.3f%n", minimum);
      
        
        int aboveAverageCount = 0;
        int belowAverageCount = 0;
        double average = sum / values.length;
        for (double value : values) {
            if (value > average) {
                aboveAverageCount++;
            } else if (value < average) {
                belowAverageCount++;
            }
        }//outputs
        System.out.printf("Average value: %.3f%n", average);
        System.out.printf("Values above average: %d%n", aboveAverageCount);
        System.out.printf("Values below average: %d%n", belowAverageCount);
    }
}

