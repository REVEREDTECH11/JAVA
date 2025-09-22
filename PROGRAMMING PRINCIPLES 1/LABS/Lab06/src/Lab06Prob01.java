/**
* File: Lab06Prob01.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Oct, 11 2024
* Last Modified: Oct, 11 2024
* Description: Determine the max value from entered numbers.
*/
//This file requires gradescope input
import java.util.Scanner;

public class Lab06Prob01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //float maxValue = -Float.MAX_VALUE;
        //float minValue = Float.MIN_VALUE;
        //Did not work as intended
        float maxValue = Float.NEGATIVE_INFINITY;
        float minValue = Float.POSITIVE_INFINITY;

        boolean Vcheck = false;
        float number;

        do {
            
        	number = scanner.nextFloat();

            if (number == -19.5) {
                break;
            }

            if (number >= -100.0 && number <= 100.0) {
                if (number > maxValue) {
                    maxValue = number;
                }
                if (number < minValue) {
                    minValue = number;
                }
                Vcheck = true;
            }
        } while (true);

        if (Vcheck) {
            System.out.printf("The max value was %.1f\n", maxValue);
            System.out.printf("The min value was %.1f\n", minValue);
        } else {
            System.out.println("There were no valid values");
        }

        scanner.close();
    }
}
