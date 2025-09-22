public class Lab10Prob01 {
    public static void main(String[] args) {
        
        double[] DiviSeven = new double[21];
        //new double array with a length of 21
        for (int i = 0; i < DiviSeven.length; i++) {
            DiviSeven[i] = i * 7.0;
            //for loop to grab numbers divisible by seven
        }

        
        printArray(DiviSeven);
        //call printArray method and pass the array to it
    }

    
    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.println(value);
            //print out the numbers in the array
        }
    }
}
