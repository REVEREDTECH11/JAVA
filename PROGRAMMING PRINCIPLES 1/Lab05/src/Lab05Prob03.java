/**
* File: Labs05Prob01.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: SEP 22, 2024
* Last Modified: SEP 22, 2024
* Description: SWAP LETTERS OF STRING
*/
import java.util.Scanner;

public class Lab05Prob03 {
	
	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		System.out.print("ENTER A FIVE LETTER WORD: ");
		
		String Entry = Input.nextLine();
		//WORD MUST BE FIVE LETTERS
		if (Entry.length() != 5) {
			System.out.printf("The string you entered %s does not contain 5 characters" , Entry);
			return;
		}
		//CHARACTER ASSIGNMENT
		//System.out.println("test");
		char first = Entry.charAt(0);
		char second = Entry.charAt(1);
		char third = Entry.charAt(2);
		char fourth = Entry.charAt(3);
		char fifth = Entry.charAt(4);
		//LETTER SWAP PROCESS
		char placeHolder = first;
		first  = fifth;
		fifth = placeHolder;
		
		placeHolder = second;
		second = fourth;
		fourth= placeHolder;
		
		String Reversed = ("" + first + second + third+ fourth + fifth);
		
		System.out.printf("For the string " + Entry + " the reverse is " + Reversed);
			
		
		
	}

}
