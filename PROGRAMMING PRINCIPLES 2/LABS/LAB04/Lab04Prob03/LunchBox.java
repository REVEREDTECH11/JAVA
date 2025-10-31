/**
* File: WaterBottle.java
* Class: CSCI 1302
* Professor: Joshua Farara
* Author: Greg Lamar
* Created on: Feb 15, 2024
*/


public class LunchBox {
	
    private double length, width, height;
    
    private WaterBottle waterBottle;

    // Default Constructor
    public LunchBox() {
    	//set default dimensions
        setLength(10.6); setWidth(7.7); setHeight(6.33);
        //Thermos with default dimentsion
        setWaterBottle(new Thermos(4.0, 0.9));
    }

    //Convenience Constructor
    public LunchBox(double length, double width, double height, WaterBottle waterBottle) {
    
    	setLength(length); setWidth(width); setHeight(height);
       
    	setWaterBottle(waterBottle);
   
    }

    //check if waterbottle is valid (fits)
    public boolean isValid(WaterBottle waterBottle) {

    	if (waterBottle instanceof Thermos && getHeight() - 2 > waterBottle.getHeight() && getWidth() * 0.25 >= waterBottle.getRadius() * 2) {
            
    		return true;
        
    	}
        
    	System.out.println("Invalid Thermos for LunchBox.");
        
        return false;
    }

    //update thermos if waterbottle is invalid
    public void setWaterBottle(WaterBottle waterBottle) {
        
    	if (isValid(waterBottle)) {
        
    		this.waterBottle = waterBottle;
        
    	} else {
        
    		System.out.println("Setting default Thermos due to invalid bottle.");
            
    		this.waterBottle = new Thermos();
    
    	}
    
    }

    //setters and getters
    public double getLength() { 
    	
    	return length; 
    	
    }
    
    public void setLength(double length) { 
    	
    	this.length = length > 0 ? length : 10.6; 
    	
    }
    
    public double getWidth() { 
    	
    	return width; 
    	
    }
    
    public void setWidth(double width) { 
    	
    	this.width = width > 0 ? width : 7.7; 
    	
    }
    
    public double getHeight() { 
    	
    	return height; 
    	
    }
    
    public void setHeight(double height) { 
    	
    	this.height = height > 0 ? height : 6.33; 
    	
    }

    public WaterBottle getWaterBottle() { 
    	
    	return waterBottle; 
    	
    }
    
}
