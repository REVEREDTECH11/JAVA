import java.util.Random;
import java.util.Scanner;

public class rsbtest {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);

        System.out.println("WELCOME TO RO-SHAM-BO OR ROCK PAPER SCISSORS");

        System.out.println("THE RULES ARE AS FOLLOWS:");

        //System.out.println("PAPER BEATS ROCK, ROCK BEATS SCISSORS, SCISSORS BEATS PAPER");
        System.out.println("If you chose Rock, you win if the oppenent chose Scissors");
        System.out.println("IF YOU CHOSE PAPER, YOU WIN IF THE OPPENENT CHOSE ROCK");
        System.out.println("IF YOU CHOSE SCISSORS, YOU WIN IF THE OPPONENT CHOSE PAPER");
        System.out.println("AND VICE VERSA");
        System.out.println("IF CHOICES ARE EQUAL THEN IT IS A TIE");
        System.out.println("HOW MANY ROUNDS DO YOU WANT TO PLAY");
        int roundCount = input.nextInt();
        System.out.println("NOW LET'S BEGIN");
        //input.close();
        //System.out.println()
        
        

        

        

        final String[] cPu = {"ROCK", "PAPER", "SCISSORS"};

        Random random = new Random();

        //int index = random.nextInt(cPu.length);

        //System.out.println(cPu[index]);

        //System.out.println("ROCK, PAPER, SCISSORS, SHOOT!!!");
        
        //Scanner moves = new Scanner(System.in);


        int win = 0, lose = 0, ties = 0, x = 0, count = 0;

        

        while (count < roundCount) {
        
        //while (true) {
        	
            System.out.println("ROCK, PAPER, SCISSORS, SHOOT!!!");
            
            Scanner playerMoves = new Scanner(System.in);


            int index = random.nextInt(cPu.length);

            String computerMove = cPu[index];

            //String player = move.nextLine();

            String player = playerMoves.nextLine().toUpperCase();

            //System.out.println("YOU CHOSE " + player.toUpperCase());

            //System.out.println("YOU CHOSE " + player);

            //System.out.print(player);

            //if (Integer.parseInt(player) == index ) {

            if (player.equalsIgnoreCase(computerMove)) {

                System.out.println(player + " TIES " + computerMove);
                System.out.println("ITS A TIE");

                ties = ++ties;

                x = ++x;

                //System.out.print(computerMove);
                
                count++;

            }else if ((player.equalsIgnoreCase("SCISSORS") && computerMove.equals("PAPER")) || (player.equalsIgnoreCase("ROCK") && computerMove.equals("SCISSORS")) || (player.equalsIgnoreCase("PAPER") && computerMove.equals("ROCK"))) {

                win = ++win;

                x = ++x;

                System.out.println("Cpu chose " + computerMove);
                
                System.out.println("YOU WIN!!!");
                
                count++;


            }else{

                //System.out.println(computerMove);

                System.out.println("YOU LOSE!!!");

                lose = ++lose;

                x = ++x;
                
                count++;

                continue;

            }
            //System.out.println("YOU WON " + win + "TIMES");


        }

      System.out.println("YOU WON " + win + "TIMES");

      System.out.println("YOU LOSE " + lose + "TIMES");

      System.out.println("YOU TIED " + ties + "TIMES");
        
      System.out.print("Count: " + count);
        

        //quit();

        //System.out.println("the end");

        

    }
	
}

