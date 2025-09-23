/**
* File: PAssign08.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Oct, 15 2024
* Last Modified: Oct, 15 2024
* Description: 
*/

import java.util.Scanner;

public class PAssign08 {
    
	public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Numbers: ");
        
        int input = scanner.nextInt();
        
        int[] Numbers = new int[input];

      
        for (int i = 0; i < input; i++) {
            System.out.print("Enter value (" + (i + 1) + " of " + input + "): ");
            //System.out.println(" ");
            Numbers[i] = scanner.nextInt();
        }
        System.out.println(" ");		
        
        for (int i = 0; i < Numbers.length; i++) {
        
        	System.out.println("Index " + i + ": " + Numbers[i]);
        }

      
        int maxNum = Numbers[0];
        
        int minNum = Numbers[0];
        
        int maxIndex = 0;
        
        int minIndex = 0;
        //declare variable for finding max and min values
        for (int i = 1; i < Numbers.length; i++) {
        //loop for solving for the max and min
        	if (Numbers[i] > maxNum) {
            
        		maxNum = Numbers[i];
                
        		maxIndex = i;
            }
            
        	if (Numbers[i] < minNum) {
            
        		minNum = Numbers[i];
                
        		minIndex = i;
            }
        }

       double sum = 0;
     
       for (int value : Numbers) {
       
    	   sum += value;
       
       }
       
       double average = sum / input;
       //declare new double variable(average) and set equal to sum / input
       int countOver = 0;
       //initialize countOver
       int countUnder = 0;
       //initialize countUnder
       for (int value : Numbers) {
       
    	   if (value > average) {
           //calculate count over
    		   countOver++;
            
    	   } else if (value < average) {
           //calculate count under
    		   countUnder++;
            
    	   }
        
       }

       	System.out.println("");
       	
        System.out.println("Maximum: " + maxNum + " at index " + maxIndex);
       
        System.out.println("Minimum: " + minNum + " at index " + minIndex);
        
        System.out.printf("Average: %.4f%n", average);
        
        //System.out.printf("Average: " + average);
        //Wrong format
        System.out.println("Values over average: " + countOver);
        
        System.out.println("Values under average: " + countUnder);
        //Print indexed data
    }
	
}

