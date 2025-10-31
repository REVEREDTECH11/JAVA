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
       	//HEIGHT AND RADIUS(DEFAULT)
        this(12, 2);
    }

    //CONVENIENCE CONSTRUCTOR
    public WaterBottle(double height, double radius) {
        
        setHeight(height);
        
        setRadius(radius);
       
        setColor("green");
        
        checkInitialVolume();
    }

    @Override
    public String drink() {
       
        return ""; 
    }

    @Override
    public int compareTo(WaterBottle other) {
       
        return Double.compare(this.getVolume(), other.getVolume());
    }

    @Override
    public WaterBottle clone() {
       
        try {
           
            WaterBottle cloned = (WaterBottle) super.clone();
           
            cloned.setColor(new String(this.color));
         
            return cloned;
       
        } catch (CloneNotSupportedException e) {
       
            throw new AssertionError();
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

    public double getVolume() {
    
        return Math.PI * getRadius() * getRadius() * getHeight();
        
    }

	//MUTATORS
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

    private void checkInitialVolume() {
    
        if (this.getVolume() > WaterBottle.getLargestInitialVolume()) {
        
            largestInitialVolume = this.getVolume();
        }
    }
}
