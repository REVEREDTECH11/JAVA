/**
* File: WaterBottle.java
* Class: CSCI 1302
* Professor: Joshua Farara
* Author: Greg Lamar
* Created on: Feb 15, 2024
*/


public class LunchBag {
	
    private double length, width, height;
    
    private WaterBottle waterBottle; // will hold a StandardWaterBottle

    //Default Constructor
    public LunchBag() {
        //set default values
    	setLength(11.2); setWidth(6.1); setHeight(7.9);
    	//set defualt water bottle
    	setWaterBottle(new StandardWaterBottle(12, 2));
    
    }

    //Convenience Constructor
    public LunchBag(double length, double width, double height, WaterBottle waterBottle) {
        //set default lunchbag
    	setLength(length); setWidth(width); setHeight(height);
    	//set default waterbottle
        setWaterBottle(waterBottle);
    }

    // isValid method to validate WaterBottle type and dimensions
    public boolean isValid(WaterBottle waterBottle) {
        // Must be StandardWaterBottle and follow size rules
        if (waterBottle instanceof StandardWaterBottle && 
        		
            waterBottle.getRadius() * 2 > 0 && waterBottle.getRadius() * 2 <= 4) {
        	
            return true;
        
        }
        
        System.out.println("Invalid StandardWaterBottle for LunchBag.");
        
        return false;
    
    }

    //check if water bottle is valid
    public void setWaterBottle(WaterBottle waterBottle) {
       
    	if (isValid(waterBottle)) {
          
    		this.waterBottle = waterBottle;
       
    	} else {
          
    		System.out.println("Setting default StandardWaterBottle due to invalid bottle.");
    		//default standardwaterbottle
    		this.waterBottle = new StandardWaterBottle();
        
    	}
    
    }

    //setters and getters
    public double getLength() { 
    	
    	return length; 
    
    }
  
    public void setLength(double length) { 
    	
    	this.length = length > 0 ? length : 11.2; 
    	
    }
    
    public double getWidth() { 
    	
    	return width; 
    	
    }
    
    public void setWidth(double width) { 
    	
    	this.width = width > 0 ? width : 6.1; 
    	
    }
    
    public double getHeight() { 
    	
    	return height; 
    	
    }
    
    public void setHeight(double height) { 
    	
    	this.height = height > 0 ? height : 7.9; 
    	
    }

    public WaterBottle getWaterBottle() { 
    	
    	return waterBottle; 
    	
    }
    
}
