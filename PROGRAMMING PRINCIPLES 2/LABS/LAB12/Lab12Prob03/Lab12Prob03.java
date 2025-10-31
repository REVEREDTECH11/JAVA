import java.util.Scanner;

public class Lab12Prob03 {

   
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Handle null or empty input
        }
        return reverseStringHelper(str, str.length() - 1);
    }

    
    private static String reverseStringHelper(String str, int index) {
    	
        if (index == 0) {
        	
            return String.valueOf(str.charAt(0)); // Base case: only one character left
            
        } else {
        	
            return str.charAt(index) + reverseStringHelper(str, index - 1);
        }
        
    }

    public static void main(String[] args) {
        // Test cases
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();
        scanner.close();

        System.out.println(inputString + " reversed is " + reverseString(inputString));

    }
}