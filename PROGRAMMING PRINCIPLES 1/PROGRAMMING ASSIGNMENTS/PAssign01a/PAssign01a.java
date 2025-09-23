/**
* File: PAssign01a.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Sep 6, 2024
* Last Modified: Nov 26, 2024
* Description: Calculate grade average in the class
*/
import java.util.Scanner;

public class PAssign01a{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double beverages = 0.50;
        //drinks price assigned to a variable
        double sandwiches = 2.75;
        //sandwhich price assigned to a variable
        System.out.print("How many drinks do you want? ");
        
        double totalbev = scanner.nextDouble();
        
        System.out.print("How many sandwiches do you want? ");
        
        double totalsand = scanner.nextDouble();
          
        double total = (beverages * totalbev) + (sandwiches * totalsand);
        
        System.out.println("The total of " + totalbev + " beverages and " + totalsand + " sandwiches is $" + total + ("."));
        
        
    }
}