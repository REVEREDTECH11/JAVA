import java.util.Scanner;

public class PAssign05b {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int ValidGrades = 0, InvalidGrades = 0, Lowest = 100, Highest = 0;
		
		int A = 0, B = 0, C = 0, D = 0, F = 0;
		
		System.out.print("Number of Grades: ");
		
		int GradeAmount = input.nextInt();
		
		for (int i = 0; i < GradeAmount; i++) {
			System.out.print("Enter grade from 0-100 " + ("(" + ( i + 1)) + " of " + GradeAmount + "):");
			int Grade = input.nextInt();
			
			if (Grade <= 100 && Grade >= 0) {
				
				ValidGrades++;
				
				if (Grade < Lowest) {
					
					Lowest = Grade;
				}
				
				if (Grade > Highest) {
					
					Highest = Grade;
				}
				
				//if (Grade < Lowest) {
					
					//Lowest = Grade;
				
				
				if (Grade >= 90) {
					
					A++;
				}else if (Grade >= 80 ) {
					
					B++;
				
				}else if (Grade >= 70) {
					 
					C++;
				
				}else if (Grade >= 60) {
					 
					D++;
				
				} else {
					
					F++;
				}
			} else {
				System.out.println("ERROR: That is not a valid score.");
				InvalidGrades++;
				}
		}
		if (ValidGrades == 0) {
				Lowest = 0;
		}
		
		System.out.println("Valid grades:\t" + ValidGrades);
		System.out.println("Invalid grades:\t" + InvalidGrades);
		System.out.printf("Highest grade:\t%.2f\n" ,(double) Highest);
		System.out.printf("Lowest grade:\t%.2f\n",(double) Lowest);
		System.out.println();
		System.out.println("As:\t" + A);
		System.out.println("Bs:\t" + B);
		System.out.println("Cs:\t" + C);
		System.out.println("Ds:\t" + D);
		System.out.println("Fs:\t" + F);
		
	}
}