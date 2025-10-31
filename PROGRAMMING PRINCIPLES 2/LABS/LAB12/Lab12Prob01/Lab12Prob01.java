import java.util.Scanner;

public class Lab12Prob01 {

    
    public static int recursiveAbstract(int n) {
        if (n == 0) 
            return 1;
        if (n == 1) 
            return 3;
        if (n == 2) 
            return 4;
        return recursiveAbstract(n - 3) * (recursiveAbstract(n - 2) - recursiveAbstract(n - 1));
        }
        
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       while(true) {
       // Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        System.out.println("f(" + input + ") = " + recursiveAbstract(input));
       }

    }
    
}
