/**
* File: WaterBottle.java
* Class: CSCI 1302
* Professor: Joshua Farara
* Author: Greg Lamar
* Created on: Feb 15, 2024
*/

public class Thermos extends WaterBottle {

    //Default constructor
    public Thermos() {
    	//set defaults
    	super(4.0, 0.9);     }

    //Convenience constructor
    public Thermos(double height, double radius) {
    	//calls super class with default values
        super(height, radius);
    }

    //Override
    @Override
    public String getInfo() {
    	//return super.getInfo + require text
    	return super.getInfo() + " and is appropriate for LunchBox instances";
    
    }

}
