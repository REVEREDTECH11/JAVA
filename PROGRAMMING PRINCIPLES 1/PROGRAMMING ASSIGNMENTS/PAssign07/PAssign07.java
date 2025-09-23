/**
* File: PAssign07.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Oct, 25 2024
* Last Modified: Nov, 1 2024
* Description: Methods
*/
import java.util.Scanner;

	
public class PAssign07 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//System.out.print("Enter a String: ");
		
		//String word = input.nextLine();
		
		//String[] sep = word.split(",");
		
		boolean go = true;
		
		do {
			System.out.print("Enter a string: ");
			
			String word = input.next();
		
			
			if (word.equals("STOP")) {
				
				go = false;
				
			}else{
				System.out.print("Enter a character: ");
				char letter = input.next().charAt(0);
				int count = countCharacters(word, letter);
				printCount(word, letter, count);
				String reverseString = reverseString(word);
				System.out.println("The reverse of " + word + " is " + reverseString + "\n");
				}
		}while(go);
		
			
/**		public static int countCharacter(String word, char ltr) {
			
			for(int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == ltr ) {
					count++;
				}
				
			}*/
			//return count;
		
		}
		
		public static void printCount(String word, char ltr, int count) {
			System.out.println(ltr + " occurs in " + word + " " + count + " times");
			
			
		}
		
		public static String reverseString(String word) {
			
			String reversed = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				
				reversed += word.charAt(i);
			}
			
			return reversed;
			
		
		
		}
		
		
		
	
		public static int countCharacters(String word, char letter) {
			int count = 0;
			for(int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == letter ) {
					count++;
				}
			}
			return count;
		}
}