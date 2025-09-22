import java.util.Scanner;
	
public class Lab03Prob03 {
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("What is your total credit hours: ");
		
			int creditHours = scanner.nextInt();
			
			System.out.print("What are your required credit hours: ");
			
			int requiredCreditHours = scanner.nextInt();
			
			System.out.println("You have " + creditHours + " credit hour(s).");
			
			System.out.println("Your degree requires " + requiredCreditHours + " credit hour(s).");
			
			int remaingingCreditHours = requiredCreditHours - creditHours;
			
			System.out.println("You have " + remaingingCreditHours + " credit hour(s) until graduation.");
			
			double semestersRemaining = (double) remaingingCreditHours / 15;
			
			System.out.println("You have " + semestersRemaining + " semester(s) (@ " + remaingingCreditHours + " credit hours/semester) left until graduation.");
			
			double twoSmesterYears = semestersRemaining / (int) 2.0;
			
			System.out.println("You have " + twoSmesterYears + " year(s) (@ 2 semesters/year) left until graduation.");
			
			double threeSmesterYears = semestersRemaining / (int) 3;
			
			System.out.println("You have " + threeSmesterYears + " year(s) (@ 3 semesters/year) left until graduation.");
			
			int yearsLeft = remaingingCreditHours / 30;
			int semesters= (remaingingCreditHours % 30)/15;
			int creditsLeft = remaingingCreditHours / 30;
			
			System.out.println("You have " + yearsLeft + " year(s), " + semesters + " semester(s), and " + creditsLeft+ " credit hour(s) (@ 2 semesters/year) left until graduation.");
			
			
	}
	

}