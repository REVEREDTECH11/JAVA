/**
* File: Lab11Prob02.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: 11/15/2024
* Last Modified: 11/15/2024
* Description: Processing Arrays
* 
*/
public class Lab11Prob02 {
	
    public static void main(String[] args) {
        //given array
        int[][] Prob02Array = {{2,9,4},{-512,-1024,-2048},{5,-8,-17},};
        //printRowMax method
        printRowMax(Prob02Array);
        
    }

    public static void printRowMax(int[][] array) {
      
        for (int i = 0; i < array.length; i++) {
           
        	int max = Integer.MIN_VALUE;
            
            for (int j = 0; j < array[i].length; j++) {
            	
                if (array[i][j] > max) {
                
                	max = array[i][j]; 
                
                }
            
            }

            System.out.printf("Row %d Max: %d%n", i + 1, max);

        }
    
    }

    public static void printArray(int[][] array) {

    	for (int i = 0; i < array.length; i++) {
        
    		for (int j = 0; j < array[i].length; j++) {
            
    			System.out.print(array[i][j] + " ");
            
    		}
            
    		System.out.println();
        
    	}
    
    }

}
