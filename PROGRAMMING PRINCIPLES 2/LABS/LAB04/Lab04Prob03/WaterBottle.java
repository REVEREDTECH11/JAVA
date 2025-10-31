/**
* File: WaterBottle.java
* Class: CSCI 1302
* Professor: Joshua Farara
* Author: Greg Lamar
* Created on: Feb 15, 2024
*/

//Water Bottle Class
public class WaterBottle {
	
	private double height, radius;
	
	private String color;
	
	private static double largestInitialVolume;
	
	//Default constructor
	public WaterBottle() {
		
		this(12, 2);
	
	}
	
	//Convenience constructor
	public WaterBottle(double height, double radius) {
	  
		setHeight(height); setRadius(radius); setColor("green"); checkInitialVolume();
	
	}

	
	//get volume
	public double getVolume() {
		
		return Math.PI * getRadius() * getRadius() * getHeight();
	
	}
	
	//Water bottle infp
	public String getInfo() {
		
		return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", getColor(), getHeight(), getRadius(), getVolume());
	
	}

	//get largest initial volume
	public static double getLargestInitialVolume() {
		
		return largestInitialVolume;
	
	}
	
	// check static member and update if needed
	private void checkInitialVolume() {
		
		if (this.getVolume() > WaterBottle.getLargestInitialVolume()) {
			
			WaterBottle.largestInitialVolume = this.getVolume();
		
		}
	
	}
	
	//getters and setters
	public double getHeight() {

		return height;
	
	}

	//Set to atleast zero
	public void setHeight(double height) {
		this.height = height > 0 ? height : 12;
	}

	//getRadius
	public double getRadius() {
		
		return radius;
	
	}

	//setRadius to atleast zero
	public void setRadius(double radius) {
		
		this.radius = radius > 0 ? radius : 2;
	
	}

	//geColor
	public String getColor() {
		return color;
	}

	//setColor
	public void setColor(String color) {
		
		this.color = color;
	
	}

}
