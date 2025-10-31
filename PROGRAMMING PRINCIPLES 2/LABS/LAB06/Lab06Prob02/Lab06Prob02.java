/**
* File: Lab06Prob02
* Class: CSCI 1302
* Professor: Joshua Farara
* Author: Greg Lamar
* Created on: Feb 28, 2025
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Lab06Prob02 {
    public static void main(String[] args) {
    	//OPEN FILE THROUGH AND CATCH
    	try (Scanner scanner = new Scanner(new File("src/pricelist.txt"))) {
    		//CURRENCY FORMAT
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

            //LOOP FOR SCANNING FILE AND OUTPUTTING FILE
            while (scanner.hasNext()) {
            	
                double price = scanner.nextDouble();
                
                System.out.println(currencyFormat.format(price));
            }
            
        } catch (FileNotFoundException e) {
            //IF NOT FOUND HANDLE IT
            System.err.println("File not found: " + e.getMessage());
            
        }
    	
    }
    
}
