//import gsu.Math;

import java.util.Scanner;

public class Lab04Prob02 {
    public static void main(String[] args) {
        
    	Scanner monthInput = new Scanner(System.in);
        System.out.print("Enter the of the month: ");
        int month = monthInput.nextInt();
        monthInput.close();
       
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Month " + month + " occurs during winter.");
        }	else if (month == 3 || month == 4 || month == 5) {
        	System.out.println("Month " + month + " occurs during spring.");
        }	else if (month == 6 || month == 7 || month == 8) {
        	System.out.println("Month " + month + " occurs during summer.");
        } 	else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Month " + month + " occurs during fall.");
        } 	else {
            System.out.println("That is not a valid month.");
        }
    }
}