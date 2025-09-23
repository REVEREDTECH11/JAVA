/**
* File: PAssign06.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Oct, 15 2024
* Last Modified: Oct, 15 2024
* Description: Use loops to create descending numerical triangles that are multiples of 5.
*/import java.util.Scanner;

public class PAssign06{
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int Multiples = 0;
        
        while (Multiples <= 0) {
           
        	System.out.print("Enter max number of multiples: ");
        	;
            Multiples = scanner.nextInt();
            
             if (Multiples <= 0) {
            	
                System.out.println("Please enter a positive value.");
             
             }else{
        
                continue;
            }
            
            
        }
        System.out.println("");
        System.out.println("Pattern A:");
        
        for (int i = 1; i <= Multiples; i++) {
        
            for (int j = 1; j <= i; j++) {
        
                System.out.print(5 * j + " ");
        
            }
        
            System.out.println();
        
            
        }
    

       System.out.println(""); 
       System.out.println("Pattern B:");
        
        for (int i = Multiples; i >= 1; i--) {
        
            for (int j = 1; j <= i; j++) {
        
                System.out.print(5 * j + " ");
        
            }
        
            System.out.println();
        
            
        }

        System.out.println("");
        System.out.println("Pattern C:");
        
        for (int i = 1; i <= Multiples; i++) {
        
            for (int j = i; j >= 1; j--) {
        
                System.out.print(5 * j + " ");
        
            }
        
            System.out.println();
        
            
        }
        System.out.println("");
        System.out.println("Pattern D:");
        
        for (int i = Multiples; i >= 1; i--) {
        
            for (int j = i; j >= 1; j--) {
        
                System.out.print(5 * j + " ");
        
            }
        
            System.out.println();
        
        }
        
        System.out.println();
    
        
    }

    
}