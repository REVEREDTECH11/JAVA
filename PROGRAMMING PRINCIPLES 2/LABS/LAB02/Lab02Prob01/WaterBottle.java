/**
 * File: WaterBottle.java
 * Class: CSCI 1302
 * Author: Greg Lamar
 * Created on: Jan 24, 2024
 * Last Modified: Jan 24, 2024
 * Description: Add OO to waterbottle.java
 */
public class WaterBottle {
	
	//declared variables
    double height; //water bottle height
    
    double radius; //radius of water bottle
    
    String color;
    
    //double largestInitialVolume = 0.0;

 
    public WaterBottle() {
    
    	this(12, 2);
        
    	this.color = "green";
    
    }

    public WaterBottle(double height, double radius) {
    
    	setHeight(height);
        
    	setRadius(radius);
        
    	this.color = "green";
        
    	//checkInitialVolume();
    
    }
    
    //calculate volume
    
    public double getVolume() {
    
    	return Math.PI * Math.pow(radius, 2) * height;
    
    }
    
    //get info about water bottle
    
    public String getInfo() {
    
    	return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", color, height, radius, getVolume());
    
    }
    
    //height method
    
    public double getHeight() {
    
    	return height;
    
    }
    
    //set height to zero
    
    public void setHeight(double height) {
    
    	if (height > 0.0) {
        
    		this.height = height;
        
    	} else {
        
    		this.height = 12; 
        
    	}
    
    }
    
    //method to get radius
    public double getRadius() {
    
    	return radius;
    
    }
    
    //method to set radius to 2
    public void setRadius(double radius) {
    
    	if (radius > 0.0) {
        
    		this.radius = radius;
        
    	} else {
        
    		this.radius = 2;
    
    	}
    
    }
    
    //method for getting color
    public String getColor() {
    
    	return color;
    
    }

    //method for setting default color
    public void setColor(String color) {
    
    	this.color = color;
    
    }

    //public static double getLargestInitialVolume() {
    
    //return largestInitialVolume;
    
    //}

    //public void checkInitialVolume() {
     //   double volume = getVolume();
       // if (volume > largestInitialVolume) {
         //   largestInitialVolume = volume;
        //}
    //}
}