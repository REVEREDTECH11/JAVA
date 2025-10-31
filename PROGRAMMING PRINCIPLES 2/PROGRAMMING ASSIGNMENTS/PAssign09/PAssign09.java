/**
* File: PAssign09
* Class: CSCI 1302
* Professor: Joshua Farara
* Author: Greg Lamar
* Created on: 04 26, 2025
*/
import java.io.*;


public class PAssign09 {


    public static void main(String[] args) {


        String inputFile = "src/employeeData.dat";


        String outputFile = "src/employeeDataProcessed.dat";


        try (
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(inputFile));


            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(outputFile))
        ) {

        	//continuous while loop
            while (true) {

            	
                try {
                	//read employee data

                    String name = input.readUTF();


                    double salary = input.readDouble();


                    double yearsOfService = input.readDouble();


                    Employee employee = new Employee(name, salary, yearsOfService);


                    double raisePercentage = getRaisePercentage(salary, yearsOfService);


                    employee.processRaise(raisePercentage);


                    output.writeObject(employee);
                } catch (EOFException e) {


                    break;
                }
            }
        } catch (IOException e) {


            System.err.println("Error processing employee data: " + e.getMessage());
        }
    }

    //find range
    private static double getRaisePercentage(double salary, double yearsOfService) {


        if (salary <= 30000.00) {


            return yearsOfService <= 2 ? 3.0 : 2.5;
        } else if (salary <= 60000.00) {


            return yearsOfService <= 5 ? 2.25 : 2.0;
        } else if (salary <= 80000.00) {


            return yearsOfService <= 5 ? 1.75 : 1.5;
        } else {


            return yearsOfService <= 5 ? 1.25 : 1.0;
        }
    }
}


class Employee implements Serializable {


    private static final long serialVersionUID = 1L;


    private String name;


    private double salary;


    private double yearsOfService;


    public Employee(String name, double salary, double yearsOfService) {


        this.name = name;


        this.salary = salary;


        this.yearsOfService = yearsOfService;
    }


    public void processRaise(double percentage) {


        this.salary += this.salary * (percentage / 100.0);
    }


    @Override
    public String toString() {


        return String.format("Name: %s\nSalary: $%.2f\nYears of Service: %.1f\n", name, salary, yearsOfService);
    }
}
