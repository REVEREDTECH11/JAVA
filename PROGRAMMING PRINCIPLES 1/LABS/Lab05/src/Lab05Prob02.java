/**
* File: Labs05Prob01.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: SEP 22, 2024
* Last Modified: SEP 22, 2024
* Description: Get specific characters from string
*/
import java.util.Scanner;


public class Lab05Prob02 {
	
	public static void main(String[] args) {
	
		Scanner Input = new Scanner(System.in);
	
		System.out.print("Enter word: ");
	
		String Entry = Input.nextLine();
	
		if (Entry.length() < 4) {
			System.out.print("The string you entered " + Entry + " contains less than 4 characters");
			
		}else {
			//get the character from the location with 0 being the beginning
			char firstLetter = Entry.charAt(0);
			char lastLetter = Entry.charAt(Entry.length() - 1);
			//int middleLetter = (int) Math.ceil(Entry.length() / 2) + 1;
			int middleLetter = (int) Math.ceil(Entry.length() / 2);

			char middleChar = Entry.charAt(middleLetter);			
			
			//print statesments for output
			/**
			System.out.print("For the string chuckle");
			System.out.print("first letter is " + firstLetter);
			System.out.print("last letter is  " + lastLetter);
			System.out.print("\"middle\" letter is " + middleChar);
			*/
			
			//print statement with formatting
			System.out.printf("For the string %s%nthe first letter is %c%nthe last letter is %c%n\"middle\" letter is %c", Entry, firstLetter, lastLetter, middleChar);
		}

	}

}
