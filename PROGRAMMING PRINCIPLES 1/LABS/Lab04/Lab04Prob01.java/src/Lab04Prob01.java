//import gsu.Math; //required for gradescope grading

public class Lab04Prob01 {
	
	public static void main(String[] args) {
		
		
		int age = (int)(Math.random() * 66);
		
		if (age >= 21) {
			System.out.println("You are " + age + " years old and are eligible to purchase alcohol.");
		
		} else {
				System.out.println("You are " + age + " years old and are not eligible to purchase alcohol.");
		}
	}
	

}