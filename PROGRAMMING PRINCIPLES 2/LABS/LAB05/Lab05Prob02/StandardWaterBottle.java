/**
* File: StandardWaterBottle.java
* Class: CSCI 1302
* Author: Greg Lamar
* Prof: Joshua Farara
* Created on: Feb 21
* Description: Standard Water bottle class
*/

public class StandardWaterBottle extends WaterBottle {
    public StandardWaterBottle() {
        super();
    }

    public StandardWaterBottle(double height, double radius) {
        super(height, radius);
    }

    @Override
    public String toString() {
        return super.toString() + " and is appropriate for LunchBag instances";
    }
}
