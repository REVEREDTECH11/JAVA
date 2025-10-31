/**
* File: WaterBottle.java
* Class: CSCI 1302
* Professor: Joshua Farara
* Author: Greg Lamar
* Created on: Feb 15, 2024
*/

//Set variables
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
	
		setHeight(height);
		
		setRadius(radius);
		
		setColor("green");
		
		checkInitialVolume(); // make sure to update volume
	}
	
	//Volume
	public double getVolume() {
		
		return Math.PI * getRadius() * getRadius() * getHeight();
	
	}
	
	//Get information
	public String getInfo() {
	
		return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", getColor(), getHeight(), getRadius(), getVolume());
	
	}

	
	public static double getLargestInitialVolume() {
	
		return largestInitialVolume;
	
	}
	
	//Check initial volume and update if needed
	private void checkInitialVolume() {
	
		if (this.getVolume() > WaterBottle.getLargestInitialVolume()) {
		
			WaterBottle.largestInitialVolume = this.getVolume();
		
		}
	
	}

	//Setter and Getters
	public double getHeight() {
	
		return height;
	
	}

	public void setHeight(double height) {
	
		this.height = height > 0 ? height : 12;
	
	}

	public double getRadius() {
	
		return radius;
	
	}

	//Set radius - must be over zero
	public void setRadius(double radius) {
	
		this.radius = radius > 0 ? radius : 2;
	
	}

	public String getColor() {
	
		return color;
	
	}

	public void setColor(String color) {
	
		this.color = color;
	
	}

	
}
