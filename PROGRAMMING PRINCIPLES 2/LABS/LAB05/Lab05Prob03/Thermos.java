/**
* File: StandardWaterBottle.java
* Class: CSCI 1302
* Author: Greg Lamar
* Prof: Joshua Farara
* Created on: Feb 21
* Description: Thermos
*/

public class Thermos extends WaterBottle {
    public Thermos() {
        super(4, 0.9);
    }

    public Thermos(double height, double radius) {
        super(height, radius);
    }

    @Override
    public String toString() {
        return super.toString() + " and is appropriate for LunchBox instances";
    }
}
