/**
 * File: WaterBottleTest.java
 * Class: CSCI 1302
 * Author: Greg Lamar
 * Created on: Jan 17, 2024
 * Last Modified: Jan 17, 2024
 * Description: Tests the WaterBottle class
 */
public class WaterBottleTest{
	//Set main method
    public static void main(String[] args) {
        //create default water bottle and a convenience constructor water bottle
    	WaterBottle bottle1 = new WaterBottle();
        System.out.println(bottle1.getInfo());
        //create convenience constructor bottle one
        WaterBottle InputBottle1 = new WaterBottle(9.50, 1.50, "green");
        System.out.println(InputBottle1.getInfo());
        //create convenience constructor bottle two
        WaterBottle InputBottle2 = new WaterBottle(10.00, 2.50, "blue");
        System.out.println(InputBottle2.getInfo());
    }
}
