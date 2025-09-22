public class Lab10Prob03 {
	
    public static void main(String[] args) {
        
        int[] highTemps = {66, 73, 77, 79, 81, 82, 83, 85, 85, 87, 82};
        int[] lowsTemps = {41, 44, 49, 51, 49, 62, 59, 59, 57, 61, 63};
        //create arrays with lows and highs

        
        int[] differences = new int[highTemps.length];
        for (int i = 0; i < highTemps.length; i++) {
            differences[i] = highTemps[i] - lowsTemps[i];
            //get difference of weather.
        }

        System.out.print("Days greater than 25 degree difference:\r\n");
        for (int i = 0; i < differences.length; i++) {
            if (differences[i] > 25) {
            	System.out.printf("Day %s:\t%s%n", i, differences[i]);
            	//System.out.printf("Day %d: %4d%n", i , differences[i]);
            	//System.out.println("Day " + i + ":    " + differences[i]);
                //System.out.printf("Day %d:   %d%n", i, differences[i]);
                //System.out.printf("Day: %ds\tGrade: %.2f%n", i, differences[i]);
            }
        }
        System.out.println("");
        int minLow = Integer.MAX_VALUE;
        int maxHigh = Integer.MIN_VALUE;
        int totalLows = 0;
        int totalHighs = 0;
        int sumDif = 0;
        int countAboveAverage = 0;
        //find max and min and get total above average

        for (int i = 0; i < lowsTemps.length; i++) {
            if (lowsTemps[i] < minLow) {
                minLow = lowsTemps[i];
            }
            if (highTemps[i] > maxHigh) {
                maxHigh = highTemps[i];
            }
            totalLows += lowsTemps[i];
            totalHighs += highTemps[i];
            sumDif += differences[i];
        }

        double avgLow = totalLows / (double) lowsTemps.length;
        double avgHigh = totalHighs / (double) highTemps.length;
        double avgDif = sumDif / (double) differences.length;

        for (int difference : differences) {
            if (difference > avgDif) {
                countAboveAverage++;
            }
        }

        System.out.println("Statistics:");
        System.out.printf("Min Low: %d%n", minLow);
        System.out.printf("Average Low: %.2f%n", avgLow);
        System.out.println("");
        System.out.printf("Max High: %d%n", maxHigh);
        System.out.printf("Average High: %.2f%n", avgHigh);
        System.out.println("");
        System.out.printf("Average Difference: %.2f%n", avgDif);
        System.out.printf("Number of days with above-average difference: %d out of %d%n", countAboveAverage, highTemps.length);
        System.out.println("");
        //print out all statements
    }
}
