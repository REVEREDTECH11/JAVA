/**
* File: WaterBottle.java
* Class: CSCI 1302
* Professor: Joshua Farara
* Author: Greg Lamar
* Created on: Feb 15, 2024
*/

public class StandardWaterBottle extends WaterBottle {
    
    //Default constructor
    public StandardWaterBottle() {
        
    	super();
    
    }

    //Convenience constructor
    public StandardWaterBottle(double height, double radius) {
        
    	super(height, radius); // Calls the superclass convenience constructor
    
    }

    //Override
    @Override
    public String getInfo() {
        
    	return super.getInfo() + " and is appropriate for LunchBag instances";
   
    }

}
