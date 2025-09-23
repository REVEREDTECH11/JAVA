/**
* File: PAssign10.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Nov 20, 2024
* Last Modified: Nov 26, 2024
* Description: Calculate grade average in the class
*/
public class PAssign10 {
	
    public static void main(String[] args) {
    //Given array for container dimensions
    	double[][] shippingContainers = {
            {47.19, 39.19, 36.50}, {59.25, 59.25, 54.50}, {47.25, 29.25, 29.50},
            {23.19, 19.20, 19.50}, {17.33, 17.33, 17.50}, {83.19, 47.25, 42.50},
            {23.33, 19.33, 19.50}, {31.25, 23.25, 23.50}, {29.33, 29.33, 24.50},
            {23.19, 23.19, 23.19}, {35.19, 35.19, 30.50}, {47.19, 44.19, 29.50},
            {40.19, 27.88, 20.00}, {59.19, 47.19, 42.50}, {47.19, 47.19, 22.50},
            {39.33, 39.33, 34.50}, {47.25, 29.25, 29.50}, {35.19, 21.19, 16.50},
            {11.33, 11.33, 11.50}, {47.19, 39.19, 29.50}, {47.19, 47.19, 42.50},
            {66.19, 29.20, 25.00}, {57.19, 41.19, 40.50}, {59.25, 59.25, 42.50},
            {71.25, 47.25, 42.50}};

        printShippable(shippingContainers);
    }

    public static void printShippable(double[][] containers) {
    	//Units for dimensional analysis
        double convCmtoIn = 0.3937007874;
        //for loop for dimensional analysis
        for (int i = 0; i < containers.length; i++) {
        
        	double width = containers[i][0] * convCmtoIn;
            
        	double length = containers[i][1] * convCmtoIn;
            
        	double height = containers[i][2] * convCmtoIn;
            
        	double volume = width * length * height;

            if (volume >= 2000 && volume <= 7000) {
            	//output
            	System.out.printf("Container %d (%,.2f in^3) can be shipped%n", i, volume);
            
            }
       
        }
    
    }

}
