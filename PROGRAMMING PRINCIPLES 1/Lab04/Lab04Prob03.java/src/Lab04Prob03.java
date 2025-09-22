//import gsu.Math; //needed for gradescope grading
import java.util.Random;

public class Lab04Prob03 {
    
    public static void main(String[] args) {
        
        double raise = 0;
        
        double salary = 40000;
        
        //Random random = new Random();
        
        //int rand = random.nextInt(951); 
        int rand = (int)(Math.random() * 951);
        
        int statusNumber = rand % 7;
        
        if (statusNumber == 0) {
            raise = 0.0;
        } else if (statusNumber == 1) {
            raise = 3.7;
        } else if (statusNumber == 2) {
            raise = 4.2;
        } else if (statusNumber == 3) {
            raise = 5.7;
        } else if (statusNumber == 4) {
            raise = 6.1;
        } else if (statusNumber == 5) {
            raise = 7.3;
        } else if (statusNumber == 6) {
			raise = 8.7;
        }
        
        double newpay = salary + (salary * raise / 100);
        
        System.out.print("With a random status of " + statusNumber + " and an initial salary of $" + salary + ", your raise is\n" + raise + "% which equates to a new salary of $" + newpay +".");
    }
}
