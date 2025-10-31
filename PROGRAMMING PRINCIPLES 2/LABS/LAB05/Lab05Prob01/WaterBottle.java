/**
* File: StandardWaterBottle.java
* Class: CSCI 1302
* Author: Greg Lamar
* Prof: Joshua Farara
* Created on: Feb 21
* Description: Standard Water bottle class
*/
public class WaterBottle {
    private double height, radius;
    private String color;
    private static double largestInitialVolume;
    
    public WaterBottle() {
        this(12, 2);
    }
    
    public WaterBottle(double height, double radius) {
        setHeight(height);
        setRadius(radius);
        setColor("green");
        checkInitialVolume(); 
    }
    
    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * getHeight();
    }
    
    @Override
    public boolean equals(Object obj) {
        //Check if the same instance
        if (this == obj) return true;
        //Check if obj is an instance of WaterBottle
        if (!(obj instanceof WaterBottle)) return false;
        
        WaterBottle other = (WaterBottle) obj;
        //Two WaterBottles are equal if they have the same radius and height
        return this.radius == other.radius && this.height == other.height;
    }

    @Override
    public String toString() {
        //Use String.format to create a formatted string representation
        return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", 
                getColor(), getHeight(), getRadius(), getVolume());
    }

    // Getter and setter methods
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        //Height must be greater than zero
        this.height = height > 0 ? height : 12;
    }

    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        //Radius must be greater than zero
        this.radius = radius > 0 ? radius : 2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static double getLargestInitialVolume() {
        return largestInitialVolume;
    }
    
    private void checkInitialVolume() {
        if (this.getVolume() > WaterBottle.getLargestInitialVolume()) {
            largestInitialVolume = this.getVolume();
        }
    }
}
