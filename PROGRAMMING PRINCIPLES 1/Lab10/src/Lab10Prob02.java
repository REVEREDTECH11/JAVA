public class Lab10Prob02 {
    public static void main(String[] args) {
        
    double[] newArray = {18.7, -22.2, 43.4, 74.1, -25.5, 46.6, 27.8};
    //new array with values
    double[] halfNew = halfNewArray(newArray);
    //half
    printArray(halfNew);
    }
    
        
    
    public static double[] halfNewArray(double[] array) {
    	
    	int middle = (int) Math.ceil(array.length/2.0);
    	double[] halfArray = new double[middle];
    	//half array set it equal to the new halfArray variable
    	for (int i = 0; i < middle; i++) {
    		halfArray[i] = array[i];
    	}
    	return halfArray;
    	//return the halved array
    	
    }

    
    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.println(value);
            //print out the numbers in the array
        }
    }
}
    

