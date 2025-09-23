/**
* File: PAssign03.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Sep 13, 2024
* Last Modified: Nov 25, 2024
* Description: Use if statements to calculate total price
*/
import java.util.Scanner;

public class PAssign03{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double bevprice = 0.50;
        //drinks price assigned to a variable
        double sandprice = 2.75;
        //sandwhich price assigned to a variable
        System.out.print("Enter the number of beverages: ");
        
        double bevamount = scanner.nextDouble();
        
        if (bevamount > 0) {
        	System.out.println("Ordered: " + bevamount + " beverages");
        }else if (bevamount == 0) {
        		System.out.println("ERROR: A quantity of zero is not allowed.");  
        		System.out.print("Enter the number of beverages: ");
        		bevamount = scanner.nextDouble();
        		System.out.println("Ordered: " + bevamount + " beverages");
        }
        
        System.out.print("Enter the number of sandwiches: ");
        
        double sandamount = scanner.nextDouble();
        
        
        if (sandamount > 0) {
        	System.out.println("Ordered: " + sandamount + " sandwiches");
        }else if (sandamount == 0) {
        		System.out.println("ERROR: A quantity of zero is not allowed."); 
        		System.out.println("Enter the number of sandwiches: ");
        		sandamount = scanner.nextDouble();
        		System.out.println("Ordered: " + sandamount + " sandwiches");
        }
        //calculations
        if (bevamount > 0 && sandamount > 0) {
        	double total = (bevamount * bevprice ) + (sandamount * sandprice);
        	
        	double subtotal = (total * 1.075 );
        
        	System.out.println("The subtotal of " + bevamount + " beverages and " + sandamount + " sandwiches is $" + total +".");
        	System.out.println("With tax, the total is $" + subtotal + ".");
        }else {
        	System.out.println("Your order total could not be calculated due to a zero quantity for an item.");
        }
    }
}