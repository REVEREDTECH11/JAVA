/**
* File: Lab11Prob03.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: 11/15/2024
* Last Modified: 11/15/2024
* Description: Processing Arrays
*/
public class Lab11Prob03 {
	
    public static void main(String[] args) {
        
        int[][] givenArray = {{1, 2, 3},{5, 4, 6},{9, 8, 7},{12, 10, 11}};
       
        print2DArray(givenArray);

       
        int[][] transposedArray = transpose2DArray(givenArray);

        print2DArray(transposedArray);
        
    }

    public static void print2DArray(int[][] array) {
   
    	for (int i = 0; i < array.length; i++) {
        
    		for (int j = 0; j < array[i].length; j++) {
            
    			System.out.print(array[i][j] + " ");
            
    		}
            
    		System.out.println();
    
    	}
    
    }
    
    public static int[][] transpose2DArray(int[][] array) {
    
    	int rows = array.length; 
        
    	int columns = array[0].length; 

        int[][] transposedArray = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
        
        	for (int j = 0; j < columns; j++) {
            
        		transposedArray[j][i] = array[i][j]; 
            
        	}
       
        }

        return transposedArray;
    
    }

}

    	