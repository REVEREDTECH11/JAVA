/**
* File: WaterBottle.java
* Class: CSCI 1302
* Author: Lamar, Greg
* Created on: Mar 14, 2025
*/


public class Thermos extends WaterBottle {

	//DEFAULT CONSTRUCTOR
	public Thermos() {
	
        super(4, 0.9);
    }

    //CONSTRUCTORS WITH PARAMETERS
    public Thermos(double height, double radius) {
    
        super(height, radius);
    }

    @Override
    public String drink() {
    
        return "Open drink spout, tilt body";
    }

    @Override
    public String toString() {
    
        return super.toString() + " and is appropriate for LunchBox instances";
    }
}
