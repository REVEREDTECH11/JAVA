/**
* File: PAssign02.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Sep 6, 2024
* Last Modified: Nov 26, 2024
* Description: Calculate grade average in the class
*/

import java.util.Scanner;

public class PAssign02 {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
	
		double[] w = {0.10, 0.10, 0.10, 0.15, 0.15, 0.15, 0.25};
		
		System.out.print("Enter Revel Grade: ");
		//Enter revel grades
		double Revel = input.nextDouble();
		
		int entered = 1;
		
		System.out.print("Enter Lab Assignments grade: ");
		//enter assignment grades
		double Lab = input.nextDouble();
		
		int a = ++entered;
		
		System.out.print("Programming assignments: ");
		//enter  programming assignments grades
		double prog = input.nextDouble();
		
		int b = ++entered;
		
		System.out.print("Enter Exam 1 grade: ");
		//enter exam 1 grade
		double exam1 = input.nextDouble();
		
		int c = ++entered;
		
		System.out.print("Enter Exam 2 grade: ");
		//enter exam 2 grade
		double exam2 = input.nextDouble();
		
		int d = ++entered;
		
		System.out.print("Enter Exam 3 grade: ");
		//enter exam 3 grade
		double exam3 = input.nextDouble();
		
		int e = ++entered;
		
		System.out.print("Enter Final Exam grade: ");
		//enter final exam grade
		double finalExam = input.nextDouble();
		
		int f = ++entered;
		//calculations for weighted grades
		//System.out.print(Revel * w);
		double RevScore = (Revel * w[0]);
		
		double LabScore = (Lab * w[1]);
		
		double ProgScore = (prog * w[2]);
		
		double exam1score = (exam1 * w[3]);
		
		double exam2score = (exam2 * w[4]);	
		
		double exam3score = (exam3 * w[5]);
		
		double finalexamscore = (finalExam * w[6]);
		
		//System.out.println("The final grade for this course is " + (RevScore + LabScore + ProgScore + exam1score + exam2score +exam3score + finalexamscore + "."));
		
		//System.out.println("There were " + f + " grades entered.");
				
		System.out.println("There were " + f + " grades entered.");
		
		System.out.println("The final grade for this course is " + (RevScore + LabScore + ProgScore + exam1score + exam2score +exam3score + finalexamscore + "."));
		
		
	}
	
	

}
