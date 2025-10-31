/**
* File: PAssign04.java
* Class: CSCI 1302
* Professor: Joshua Farara
* Author: Greg Lamar
* Created on: Feb 18, 2024
*///utilities
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Collections;


//class
public class PAssign04 {


	//main method
    public static void main(String[] args) {


    	//try 
        try (Scanner input = new Scanner(System.in)) {
			
        	
        	ArrayList<Double> values = new ArrayList<>();



			double value;


			//sentinal controlled loop
			while (true) {


				//try 
			    try {



			        System.out.print("Enter a double value (-999 to exit): ");



			        value = input.nextDouble();



			        if (value == -999) {



			            break;

			        }

			        if (values.contains(value)) {



			            throw new ArrayStoreException("Duplicate value");

			        }

			        values.add(value);
			    //catch input errors
			    } catch (InputMismatchException e) {



			        System.out.println("That is not a valid double value.");



			        input.next(); 
			        
			    } catch (ArrayStoreException e) {

			    	System.out.println(e.getMessage());
			    	

			    } catch (Exception e) {



			        System.out.println("An error has caused a halt: " + e.getMessage());

			    }

			}



			if (values.isEmpty()) {



			    System.out.println("There were no values to process");

			} else {



			    System.out.println(values);


			    //date variables
			    double averageValue = values.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);



			    double maxValue = Collections.max(values);



			    double minValue = Collections.min(values);


			    //print statements
			    System.out.printf("Average: %.2f\n", averageValue);



			    System.out.printf("Max: %.2f\n", maxValue);



			    System.out.printf("Min: %.2f\n", minValue);

			}
		}

    }

}

