// ========================================================================
// CSCI 3230 Data Structures
// Instructor: Yao Xu, Ph.D.
//
// Coding Quiz 1
//
// =========================== Requirements =============================== 
//
// Write a recursive algorithm for computing the power of a number using
// the recursion defined on page 6 of Module 2 Slides: Recursion.
// That is, given a base value x and an exponent value n, you need to
// write a Java method to compute x to the power of n, denoted as p(x, n),
// based on the following recurrence: 

   /*
   p(x, n) = 1, if n = 0;
   p(x, n) = x * p(x, (n - 1)/2)^2, if n >= 1 is odd;
   p(x, n) = x * p(x, n/2)^2, if n >= 1 is even.
   */

// Please use appropriate data types and 
// design appropriate output to demonstrate the correctness of your code.
// 
// Please prompt the user to enter the base and exponent values.
// 
// Your output may look as follows:
// ------------------------------------------------------------------------
// Please enter the base value: 2
// Please enter the non-negative integer exponent value: 9
// 2.0 raised to the power of 9 is: 512.0
// A total of 5 recursive calls were made to the power method.
// ------------------------------------------------------------------------
// Please enter the base value: 3.5
// Please enter the non-negative integer exponent value: 6
// 3.5 raised to the power of 6 is: 1838.265625
// A total of 4 recursive calls were made to the power method.
//
// ============================== Note ====================================
//
// 1. DO NOT MODIFY OR DELETE ANY GIVEN CODE OR COMMENTS!!!
// 2. You ONLY need to write code under each comment "YOUR CODE GOES HERE".
// 3. Modify the file name to "Power.java" to compile and run.
//
// ========================================================================
//Student - Gregory Lamar
import java.util.Scanner;
public class Power {
	public static int count = 0;
	   
	public static void main(String[] args) {
	    // prompt the user to enter the base and exponent values
	    // YOUR CODE GOES HERE --Part 1/2--
		Scanner input = new Scanner(System.in);
		
		//Print out statement for getting the base value
		System.out.print("Please enter the base value: ");
		
		//take input as a double if needed for base
		double base = input.nextDouble();
		
		//test line for base variable
		//System.out.print(x);
		
		//Print out statement for getting the exponent(non negative)

		System.out.print("Please enter the positive power value: ");
		//take input as an int for getting the exp
		int exp = input.nextInt();
		
		//Test line for exp variable		
		//System.out.print(n)
		 
		//close scanner
		input.close();
	   
      
      
      
      
      
      // call the power method
      double result = power(base, exp);
      
      // print out the result
      System.out.println(base + " raised to the power of " + exp 
    		  			 + " is: " + result);
      // print out the total number of recursive calls
      System.out.println("A total of " + count + " recursive calls "
    		  			 + "were made to the power method.");
   }
   
   static double power(double base, int exp) {
      count++;
      // base case:
      if (exp == 0) 
         return 1;
      // YOUR CODE GOES HERE --Part 2/2--
      //p(x, n) = x * p(x, (n - 1)/2)^2, if n >= 1 is odd;
      else if (exp % 2 != 0) {
    	  //holdNum is place holder for p(x, (n - 1)/2)
    	 double holdNum = power(base, (exp - 1) / 2);
    	 //return base * holdNum^2
    	 return (base * holdNum * holdNum);
    	 
      }
      //p(x, n) = x * p(x, n/2)^2, if n >= 1 is even.
      else {
    	  //holdNum is place holder for p(x, n/2)^2
    	  double holdNum = power(base, exp / 2);
    	  //rreturn holdNum^2
    	  return holdNum * holdNum;
    	  
    	  
    	  
    	  
    	  
    	  
      
    	  

    	  
    	  
      }





   }
}