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
    	//call super class
        super(); 
   
    }

    //Convenience constructor
    public StandardWaterBottle(double height, double radius) {
    	//call super class with defaults
    	super(height, radius); 
   
    }

    //override
    @Override
    public String getInfo() {
        
        return super.getInfo() + " and is appropriate for LunchBag instances";
    }
    
}
