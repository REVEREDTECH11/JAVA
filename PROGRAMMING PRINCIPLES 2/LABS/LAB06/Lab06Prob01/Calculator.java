/**
* File: CALCULATOR
* Class: CSCI 1302
* Professor: Joshua Farara
* Author: Greg Lamar
* Created on: Feb 28, 2025
*/
//JAVA UTILITIES
import java.util.InputMismatchException;
import java.util.Scanner;
//DECLARE CLASS CALCULATOR 
public class Calculator {
//MAIN METHOD
    public static void main(String[] args) {
        //DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        
        int number1 = 0;
        		
        int number2 = 0;
        
        char operation = 0;
        
        boolean errorOccurred = false;
        //TRY AND CATCH
        try {
            //TAKE INPUT FROM USER
            System.out.print("Enter an integer (operand 1) and press Enter: ");
            number1 = scanner.nextInt();

            System.out.print("Enter an operation (+, -, /, *) and press Enter: ");
            operation = scanner.next().charAt(0);

            System.out.print("Enter an integer (operand 2) and press Enter: ");
            number2 = scanner.nextInt();

            //GET RESULT
            int result = 0;

            //GET THE OPERATION TYPE
            switch (operation) {
            
                case '+':
            
                	result = number1 + number2;
                    
                	break;
               
                case '-':
                
                	result = number1 - number2;
                    
                	break;
               
                case '*':
                
                	result = number1 * number2;
                    
                	break;
               
                case '/':
                
                	result = number1 / number2;
                    
                	break;
                
                default:
                
                	//THROW INVALID FOR INVALID OPERATION TYPE.
                    
                	throw new InvalidCalcOperationException(operation);
            
            }

            //OUTOUT RESULTS
            System.out.printf("%d %c %d = %d\n", number1, operation, number2, result);

        } catch (InputMismatchException e) {
       
        	System.out.println("Invalid input. Please enter valid integers.");
            
        	errorOccurred = true;
       //HANDLE EXCEPTION
        } catch (InvalidCalcOperationException e) {
        
        	//OUTPUT MESSAGE
            System.out.println(e.getMessage());
            
            errorOccurred = true;
        
        } finally {
        
        	//EXCUTE TERMINATION AND PRINT OUT STATEMENT
            if (errorOccurred) {
            
            	System.out.println("The program is terminating because of an error");
           
            } else {
                    
            	System.out.print("The program is terminating");
            
            }

            scanner.close();
        
        }
    
    }

}
