/**
* File: StandardWaterBottle.java
* Class: CSCI 1302
* Author: Greg Lamar
* Prof: Joshua Farara
* Created on: Feb 21
* Description: WaterBottleTest
*/

import java.util.ArrayList;

public class WaterBottleTest {
    public static void main(String[] args) {
        // Create an ArrayList of WaterBottles
        ArrayList<WaterBottle> waterBottles = new ArrayList<>();

        // Add WaterBottle objects to the ArrayList
        waterBottles.add(new WaterBottle(12.0, 2.0)); // Default WaterBottle
        waterBottles.add(new StandardWaterBottle(12.0, 2.0)); // Default StandardWaterBottle
        waterBottles.add(new Thermos(4.0, 0.9)); // Default Thermos
        waterBottles.add(new StandardWaterBottle(10.0, 0.7)); // Custom StandardWaterBottle
        waterBottles.add(new Thermos(5.0, 0.5)); // Custom Thermos

        // Print how many items are in the collection
        System.out.println("Number of bottles: " + waterBottles.size());

        // Variables to calculate total, max, and min volume
        double totalVolume = 0;
        double maxVolume = Double.NEGATIVE_INFINITY;
        double minVolume = Double.POSITIVE_INFINITY;

        // Iterate and print each item's toString() information
        for (int i = 0; i < waterBottles.size(); i++) {
            WaterBottle wb = waterBottles.get(i);
            double volume = calculateVolume(wb);
            totalVolume += volume;

            // Update max and min volumes
            if (volume > maxVolume) {
                maxVolume = volume;
            }
            if (volume < minVolume) {
                minVolume = volume;
            }

            String appropriateMessage = (wb instanceof Thermos) 
                ? "and is appropriate for lunchbox instances" 
                : "and is appropriate for lunchbag instances";

            // Only include the message for all but the first bottle
            if (i == 0) {
                System.out.printf("A green water bottle with height %.2f, radius %.2f, and volume %.2f\n", 
                                  wb.getHeight(), wb.getRadius(), volume);
            } else {
                System.out.printf("A green water bottle with height %.2f, radius %.2f, and volume %.2f %s\n", 
                                  wb.getHeight(), wb.getRadius(), volume, appropriateMessage);
            }
        }

        // Print total, max, and min volumes
        System.out.printf("Total volume: %.4f\n", totalVolume);
        System.out.printf("Max volume: %.4f\n", maxVolume);
        System.out.printf("Min volume: %.4f\n", minVolume);
    }

    // Method to calculate the volume of a WaterBottle
    public static double calculateVolume(WaterBottle wb) {
        double radius = wb.getRadius(); // Assuming getRadius() is defined in WaterBottle
        double height = wb.getHeight(); // Assuming getHeight() is defined in WaterBottle
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
