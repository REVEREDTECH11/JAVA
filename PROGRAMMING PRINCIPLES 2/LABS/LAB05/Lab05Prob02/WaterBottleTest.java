/**
* File: StandardWaterBottle.java
* Class: CSCI 1302
* Author: Greg Lamar
* Prof: Joshua Farara
* Created on: Feb 21
* Description: Standard Water bottle class
*/


import java.util.ArrayList;

public class WaterBottleTest {
    public static void main(String[] args) {
        // Create an ArrayList of WaterBottles
        ArrayList<WaterBottle> waterBottles = new ArrayList<>();

        // Add WaterBottle objects to the ArrayList
        waterBottles.add(new WaterBottle()); // Default WaterBottle
        waterBottles.add(new StandardWaterBottle()); // Default StandardWaterBottle
        waterBottles.add(new Thermos()); // Default Thermos
        waterBottles.add(new StandardWaterBottle(10, 0.7)); // Custom StandardWaterBottle
        waterBottles.add(new Thermos(5, 0.5)); // Custom Thermos

        // Print how many items are in the collection
        System.out.println("Number of bottles: " + waterBottles.size()); // Changed wording here

        // Iterate and print each item's toString() information
        for (WaterBottle wb : waterBottles) {
            System.out.println(wb); // toString() is called implicitly
        }

        // Calculate and print the total volume
        double totalVolume = 0;
        for (WaterBottle wb : waterBottles) {
            totalVolume += calculateVolume(wb); // You need to implement this method
        }
        System.out.printf("Total volume: %.4f\n", totalVolume);
    }

    // Example method to calculate the volume of a WaterBottle
    public static double calculateVolume(WaterBottle wb) {
        double radius = wb.getRadius(); // Assuming getRadius() is defined in WaterBottle
        double height = wb.getHeight(); // Assuming getHeight() is defined in WaterBottle
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
