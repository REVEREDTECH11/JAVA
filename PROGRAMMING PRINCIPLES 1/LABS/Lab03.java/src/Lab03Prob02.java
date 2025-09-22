import java.util.Scanner;
	
public class Lab03Prob02 {
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("What is your total credit hours: ");
		
			int creditHours = scanner.nextInt();
			
			System.out.print("What are your required credit hours: ");
			
			int requiredCredithours = scanner.nextInt();
			
			System.out.println("You have " + creditHours + " credit hour(s).");
			
			System.out.println("Your degree requires " + requiredCredithours + " credit hour(s).");
			
			int left = requiredCredithours - creditHours;
			
			System.out.println("You have " + left + " credit hour(s) until graduation.");
			
			final int rem = 15;
			
			double semesters = (double) left / rem;
			
			System.out.println("You have " + semesters + " semester(s) (@ " + rem + " credit hours/semester) left until graduation.");
			
			double yyears = semesters / 2;
			
			System.out.println("You have " + yyears + " year(s) (@ 2 semesters/year) left until graduation.");
			
			double yyyears = semesters / (int) 3;
			
			System.out.println("You have " + yyyears + " year(s) (@ 3 semesters/year) left until graduation.");
			
		
	}
	

}
