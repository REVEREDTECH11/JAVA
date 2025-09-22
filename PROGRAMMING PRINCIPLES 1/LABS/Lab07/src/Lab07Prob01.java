/**
* File: Lab07Prob01.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Oct 11, 2024
* Last Modified: Oct 11, 2024
* Description: Using nested for loops
*/

public class Lab07Prob01 {
    
    public static void main(String[] args) {
        
       // Scanner input = new Scanner(System.in);
        
        
        int Star = 5;

        for (int i = Star; i > 0; i--) {
            
            for (int j = 0; j < i; j++) {
                
                System.out.print("*");
            
            }
            
            System.out.println();
        }
    }
}
