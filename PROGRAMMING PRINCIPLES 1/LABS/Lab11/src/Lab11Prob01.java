/**
* File: Lab11Prob01.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: 11/15/2024
* Last Modified: 11/15/2024
* Description: Processing arrays
*/
public class Lab11Prob01 {
    
	public static void main(String[] args) {
    //Array    
        int[][] pirateBooty = {{ 110, 1600 }, { 101, 1400 }, { 200, 50 }, { 322, 700 }, { 57, 500 },{ 625, 1500 }, { 300, 320 }, { 50, 210 }, { 100, 105 }, { 90, 400 },{ 30, 2000 }, { 200, 1300 },};

        // Iterate through the array to determine which cargo to keep or toss
        for (int i = 0; i < pirateBooty.length; i++) {
            
        	int weight = pirateBooty[i][0];
            //cargo weight
            int value = pirateBooty[i][1]; 
            //cargo value
           
            if (weight > 100 && value < 1500) {
            	System.out.printf("Cargo %2d: toss%n", i + 1);
            
            } else {
            
            	System.out.printf("Cargo %2d: keep%n", i + 1);
            
            }
     
        }
   
	}

}

