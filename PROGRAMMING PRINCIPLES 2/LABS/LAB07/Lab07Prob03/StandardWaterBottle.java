/**
* File: WaterBottle.java
* Class: CSCI 1302
* Author: Lamar, Greg
* Created on: Mar 14, 2025
*/

public class StandardWaterBottle extends WaterBottle {

    //DEFAULT CONSTRUCTOR
    public StandardWaterBottle() {
    
        super();
    }

    //CONSTRUCTORS WITH PARAMETERS
    public StandardWaterBottle(double height, double radius) {
    
        super(height, radius);
    }

    @Override
    public String drink() {
    
        return "Unscrew top, tilt body";
    }

    @Override
    public String toString() {
    
        return super.toString() + " and is appropriate for LunchBag instances";
    }
}
