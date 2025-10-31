/**
* File: WaterBottle.java
* Class: CSCI 1302
* Author: Lamar, Greg
* Created on: Mar 14, 2025
*/



import java.util.ArrayList;
import java.util.Collections;

public class WaterBottleTest {

    public static void main(String[] args) {
	//CREATE ARRAY LIST
        ArrayList<WaterBottle> bottleArr = new ArrayList<>();
        
        bottleArr.add(new StandardWaterBottle(10, 0.7));
        
        bottleArr.add(new StandardWaterBottle());         
        
        bottleArr.add(new Thermos(5, 0.5));              
        
        bottleArr.add(new Thermos());                    
        
        bottleArr.add(new Thermos(6, 0.4));               
        
        for (WaterBottle bottle : bottleArr) {
            
            System.out.println(bottle);
        }

        Collections.sort(bottleArr);

        System.out.println("\nSorted: ");
        
        for (WaterBottle bottle : bottleArr) {
        
            System.out.println(bottle);
        }

        WaterBottle smallest = Collections.min(bottleArr);
        WaterBottle largest = Collections.max(bottleArr);

        System.out.println("\nLargest: " + largest);
        System.out.println("\nSmallest: " + smallest);
    }
}
