/**
* File: LunchBox.java
* Class: CSCI 1302
* Author: Christopher Williams
* Created on: Jan, 31 2025
* Last Modified: Jan 31, 2025
* Description: Display three messages to the console
*/
public class LunchBox {
    
	//variables
    double length;
    
    double width;
    
    double height;
    WaterBottle waterBottle;

    //default constructors
    public LunchBox() {
        
    	this.length = 10.6;
        
    	this.width = 7.7;
        
    	this.height = 6.33;
        
    	this.waterBottle = new WaterBottle(4.0, 0.9);
    
    }

    //convenience constructors
    public LunchBox(double length, double width, double height, WaterBottle waterBottle) {
        
    	setLength(length);
        
    	setWidth(width);
        
    	setHeight(height);
        
    	setWaterBottle(waterBottle);
    
    }

    //getters and setters

    //Get Length
    public double getLength() {
    
    	return length;
    
    }
    
    //Set Length
    public void setLength(double length) {
    
    	if (length > 0) {
        
    		this.length = length;
        
    	} else {
        
    		this.length = 10.6;
        
    	}
    
    }

    //Get Width
    public double getWidth() {
    
    	return width;
    }

    //Set Width
    public void setWidth(double width) {
        
    	if (width > 0) {
      
        	this.width = width;
        
    	} else {
        
    		this.width = 7.7;
        
    	}
   
    }
    
    //Get Height
    public double getHeight() {
    
    	return height;
    
    }

    //Set height
    public void setHeight(double height) {
    
    	if (height > 0) {
        
    		this.height = height;
        
    	} else {
        
    		this.height = 6.33;
    
    	}
    
    }

    //Get WaterBottle
    public WaterBottle getWaterBottle() {
    
    	return waterBottle;
    
    }

    //Set WaterBottle
    public void setWaterBottle(WaterBottle waterBottle) {
    
    	if (waterBottle.height <= this.height - 2 && waterBottle.radius * 2 <= this.width * 0.25) {
        
    		this.waterBottle = waterBottle;
        
    	} else {
        
    		System.out.println("Error: WaterBottle cannot be stored. Using default WaterBottle.");
            
    		this.waterBottle = new WaterBottle(4.0, 0.9);
        
    	}
    
    }
    
    //Get Info
    public String getInfo() {
    
    	return String.format("LunchBox dimensions: %.2fL x %.2fW x %.2fH\n%s", length, width, height, waterBottle.getInfo());
    
    }

}

