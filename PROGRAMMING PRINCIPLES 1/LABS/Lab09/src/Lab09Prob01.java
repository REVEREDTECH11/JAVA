/**
* File: Lab09Prob02.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Nov, 1 2024
* Last Modified: Nov, 1 2024
* Description: Arrays
*/

//import java.util.Arrays;

//import gsu.Math; //needed for gradescope grading

public class Lab09Prob01 {
    
    public static void main(String[] args) {
        
        
        int[] values = new int[12];
        //set upper(b) and lower(a) as variables
        //b-a +1
        int upper = 256; //b
        int lower = -256; //a
        for (int num = 0; num < values.length; num++) {
            values[num] = (int) (lower + (Math.random() * (upper - lower + 1)));
        }
        
      
        System.out.println("Length: " + values.length + "\n");
        //System.out.println("");
        
      
        for (int num = 0; num < values.length; num++) {
            System.out.println(values[num]);
        }
        System.out.println();
        
       
        int minimum = values[0];
        int mindex = 0;
        for (int num = 0; num < values.length; num++) {
            if (values[num] < minimum) {
                minimum = values[num];
                mindex = num;
            }
        }
        //System.out.println("");
        System.out.println("Minimum value: " + minimum + " at index " + mindex);
    }
}
