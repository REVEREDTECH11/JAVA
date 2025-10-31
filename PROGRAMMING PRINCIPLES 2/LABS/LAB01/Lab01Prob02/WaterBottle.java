/**
 * File: WaterBottle.java
 * Class: CSCI 1302
 * Author: Greg Lamar
 * Created on: Jan 17, 2024
 * Last Modified: Jan 17, 2024
 * Description: Tests the WaterBottle class
 */

public class WaterBottle {
	//set variables
    double height;
    
    double radius;
    
    String color;
	
    //WaterBottle Class(data types)
    public WaterBottle(double height, double radius, String color) {
    	//Instance Variables(height,radius,color)
        this.height = height;
        
        this.radius = radius;
        
        this.color = color;
    
    }
    
    //default(no argument)
    public WaterBottle() {
        
    	this.height = 12;
        
        this.radius = 2;
        
        this.color = "green";
        
    }

   //get volume class
    public double getVolume() {
    	
        return Math.PI * Math.pow(radius, 2) * height;
    }

   //getInfo class
    public String getInfo() {
        //return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", color, height, radius, getVolume());
        return String.format("A %s water bottle with height %.2f radius %.2f", color, height, radius);

    }
}
