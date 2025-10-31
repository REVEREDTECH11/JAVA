/**
* File: WaterBottle.java
* Class: CSCI 1302
* Author: Lamar, Greg
* Created on: Mar 14, 2025
*/


public class WaterBottle implements Drinkable, Comparable<WaterBottle>, Cloneable {

    private double height, radius;

    private String color;

    private static double largestInitialVolume;

	//DEFAULT CONSTRUCTOR
	public WaterBottle() {

        this(12, 2);

    }

    //CONVENNIENCE CONSTRUCTOR
    public WaterBottle(double height, double radius) {

        setHeight(height);

        setRadius(radius);

        setColor("green");

        checkInitialVolume();

    }

    //DRINK METHOD
    @Override

    public String drink() {

        return "";

    }

    //COMPARE TO METHOD
    @Override
    
    public int compareTo(WaterBottle other) {
    
        return Double.compare(this.getVolume(), other.getVolume());
    
    }

    //CLONE METHOD
    @Override
    public WaterBottle clone() {
    
        try {
    
            WaterBottle cloned = (WaterBottle) super.clone();
    
            cloned.setColor(this.color);
    
            return cloned;
    
        } catch (CloneNotSupportedException e) {
    
            return null;
    
        }
    
    }

    @Override
    public String toString() {
    
        return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", 
    
                              getColor(), getHeight(), getRadius(), getVolume());
    
    }

    @Override
    public boolean equals(Object o) {
    
        if (o instanceof WaterBottle && ((WaterBottle) o).getRadius() == this.getRadius() && 
    
            ((WaterBottle) o).getHeight() == this.getHeight()) {
    
            return true;
    
        } else {
    
            return false;
    
        }
    
    }

    //MUTATORS
    public double getVolume() {
    
        return Math.PI * getRadius() * getRadius() * getHeight();
    
    }

    public double getHeight() {
    
        return height;
    
    }

    public void setHeight(double height) {
    
        this.height = height > 0 ? height : 12;
    
    }

    public double getRadius() {
    
        return radius;
    
    }

    public void setRadius(double radius) {
    
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

    //CHECK VOLUME
    private void checkInitialVolume() {
    
        if (this.getVolume() > WaterBottle.getLargestInitialVolume()) {
    
            largestInitialVolume = this.getVolume();
    
        }
    
    }

}
