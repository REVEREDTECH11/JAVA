/**
* File: InvalidCalcOperationException
* Class: CSCI 1302
* Professor: Joshua Farara
* Author: Greg Lamar
* Created on: Feb 28, 2025
*/



public class InvalidCalcOperationException extends Exception {
    
	private char operation;

    //DEFAULT CONSTRUCTOR
    public InvalidCalcOperationException() {
    	//SUPER METHOD
        super("Invalid Operation");
        
    }

    //CONVENIENCE CONSTRUCTOR
    public InvalidCalcOperationException(char operation) {
    	//CALL DEFAULT
        this();
        
        this.operation = operation;
        
    }

    //GETTERS AND SETTERS
    //GET THE CHAR getOperation
    public char getOperation() {
    //RETURN OPERATION
        return operation;
        
    }

    //SET OPERATION VALUE
    public void setOperation(char operation) {
    	
        this.operation = operation;
        
    }

    //OVER GET MESSAGE
    @Override
    public String getMessage() {
    	
        return super.getMessage() + ": " + operation + " was chosen";
        
    }
    
}
