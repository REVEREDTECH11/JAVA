import java.util.Scanner;

public class Lab12Prob02 {
	

    
    public static String reverseString(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
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
