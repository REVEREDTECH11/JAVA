/**
* File: PAssign04.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Sep 22, 2016
* Last Modified: Sep 22, 2024
* Description: Calculate area of triangle
*/
//JAVA UTILITIES
import java.util.Scanner;

import java.util.Arrays;

public class PAssign04 {

	public static void main(String[] args) {
		//SETUP SCANNER FOR ENTRY
		Scanner Input = new Scanner(System.in);
		
		System.out.print("Enter width for rectangle: ");
		
		int width = Input.nextInt();
		
		System.out.print("Enter height for rectangle: ");
		
		int height = Input.nextInt();
		
		if (width <= 0 || height <= 0) {
			System.out.println("Your rectangle must have a positive height and width.");
			
			return;
		}
		
		Input.nextLine();
		
		System.out.print("Enter x,y value for the center point of rectangle: ");
			
		String centin = Input.nextLine();
		//TEST - String centin = 10;
		
		String[] CenCor = centin.split(",");
			
		int centx = Integer.parseInt(CenCor[0].trim());
	
		int centy = Integer.parseInt(CenCor[1].trim());
	
		System.out.println("Enter x,y value for the test point: ");
			
		String point = Input.nextLine();
		//TEST - String point = 10;
		
		//SPLIT ENTRY BY COMMA
			
		String[] pointCor = point.split(",");
			
		int pointx = Integer.parseInt(pointCor[0].trim());
			
		int pointy = Integer.parseInt(pointCor[1].trim());
		
		boolean fitsarea = pointslocation(width, height, centx ,centy, pointx, pointy);
		
		if (fitsarea) {
		    System.out.printf("(%d, %d) is in the rectangle centered at (%d, %d) with width %d and height %d%n",
		            pointx, pointy, centx, centy, width, height);
		} else {
		    System.out.printf("(%d, %d) is not in the rectangle centered at (%d, %d) with width %d and height %d%n",
		            pointx, pointy, centx, centy, width, height);
		}
		//System.out.println("TEST-(" + pointx + ", " + pointy);


	}
	
	public static boolean pointslocation(int width ,int height ,int centx , int centy, int pointx, int pointy) {
		
		int DistHor =  width / 2;
		
		int DistVert = height / 2 ;
		
		return (pointx >= centx - DistHor && pointx <= centx + DistHor && pointy >= centy - DistVert && pointy <= centy + DistVert);
		
			
			
	}
	
}



