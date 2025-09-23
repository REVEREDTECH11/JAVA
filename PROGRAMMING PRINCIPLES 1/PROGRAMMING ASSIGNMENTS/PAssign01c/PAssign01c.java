/**
* File: PAssign01c.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Aug 28, 2024
* Last Modified: Nov 26, 2024
* Description:
*/

public class PAssign01c {
	
	public static void main(String[] args) {
		//variable with set values used to solved the equation.
		double volume = 0.25; //m^3
		
		int temp = 313; //kelvin
		
		final double Roskoe = 8.31446; //(J/mol)
		
		int moles = 1;
		
		double nRT = ((moles*Roskoe*temp)/volume);
		
		//System.out.print(nRT): test value
		
		System.out.println("The pressure of " + moles + " mole(s) of an ideal gas with volume " + volume+  " m^3 at temperature " + temp + " K is " +  nRT + " pascals.");	
	}

}
