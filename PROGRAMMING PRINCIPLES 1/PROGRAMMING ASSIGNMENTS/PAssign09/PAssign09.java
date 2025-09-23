/**
* File: PAssign09.java
* Class: CSCI 1301
* Author: Gregory Lamar
* Created on: Nov 12, 2024
* Last Modified: Nov 26, 2024
* Description: Calculate grade average in the class
*/
public class PAssign09 {
	
    public static void main(String[] args) {
    	//Data given
        double[] AnnualMaintenanceCost = {21500, 29275, 37250, 35322, 19757, 24625, 30300, 18759, 15217, 27090, 12439, 22005};
        double[] rentalIncomes = {26752, 21421, 39759, 24783, 15297, 25264, 32159, 16157, 21705, 19420, 18275, 21350};

        boolean[] properties = new boolean[AnnualMaintenanceCost.length];

        //for loop for calculating each property
        for (int i = 0; i < AnnualMaintenanceCost.length; i++) {
            properties[i] = keepProperty(AnnualMaintenanceCost[i], rentalIncomes[i]);
        }

       

        // Calculations
        double totalMaintenanceBefore = sum(AnnualMaintenanceCost);
        
        double totalRentalIncomeBefore = sum(rentalIncomes);
        
        double totalMaintenanceAfter = 0;
        
        double totalRentalIncomeAfter = 0;
        
        double totalDonatedRentalIncome = 0;

        for (int i = 0; i < properties.length; i++) {
            if (properties[i]) {
                totalMaintenanceAfter += AnnualMaintenanceCost[i];
                totalRentalIncomeAfter += rentalIncomes[i];
            } else {
                totalDonatedRentalIncome += rentalIncomes[i];
            }
        }

        System.out.printf("Total maintenance/renovation before donation: $%,.2f%n", totalMaintenanceBefore);
        System.out.printf("Total rental income before donation: $%,.2f%n", totalRentalIncomeBefore);
        System.out.println("");
        System.out.printf("Total maintenance/renovation after donation: $%,.2f%n", totalMaintenanceAfter);
        System.out.printf("Total rental income after donation: $%,.2f%n", totalRentalIncomeAfter);
        System.out.println("");
        System.out.printf("Total Donated Rental Income: $%,.2f%n", totalDonatedRentalIncome);
        System.out.println("");
        
        //print totals and properties
        printDecisions(properties);
    }
    
    //Method for calculating
    public static boolean keepProperty(double maintenanceCost, double rentalIncome) {
    	
        double renovationCost = maintenanceCost * 4.75;
        
        double projectedRentalIncome = rentalIncome * 10.25;
        
        return renovationCost < (projectedRentalIncome / 2);
    }

        public static void printDecisions(boolean[] properties) {
        for (int i = 0; i < properties.length; i++) {
            String decision = properties[i] ? "keep" : "donate";
            System.out.printf("Property %d - %s%n", i, decision);
        }
    }

    public static double sum(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum;
    }
    
}
