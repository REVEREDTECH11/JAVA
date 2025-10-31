/**
* File: LAB06PROB03
* Class: CSCI 1302
* Professor: Joshua Farara
* Author: Greg Lamar
* Created on: Feb 28, 2025
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab06Prob03 {
	
    public static void main(String[] args) {
        //USE TRY AND CATCH TO COMPLETE
        try (Scanner scanner = new Scanner(new File("src/pricelist.txt"));
             
        		PrintWriter writer = new PrintWriter(new File("src/pricelist-lab06.txt"))) {
        	//WHILE LOOP FOR GOINF THROUGH PRICE
            while (scanner.hasNext()) {
            	
                double price = scanner.nextDouble();

                //SET CONDITIONS
                if (price < 50) {
                   
                	price += price * 0.0625;
               
                } else if (price >= 50 && price <= 100) {
                
                	price += price * 0.125;
                
                } else if (price > 100) {
                
                	price += price * 0.25;
                
                }

                //OUTPUT PRICE ON FILE
                writer.printf("%.2f%n", price);
                
            }
            
            
        } catch (FileNotFoundException e) {
        	//IF FOUND HANDLE IT
        	System.err.println("File not found: " + e.getMessage());
        }
    }
}
