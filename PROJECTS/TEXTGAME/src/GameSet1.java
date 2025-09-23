import java.util.Scanner;

import java.util.Random;

import java.util.Arrays;


public class GameSet1 {

    public static void main(String[] args) {

        System.out.println("Fix Paper/Rock vs");

    

        System.out.println("WELCOME TO THE GAME BUNDLE 1" );

        

        Scanner input = new Scanner(System.in);

        //loop for deciding if they want to play

        while (true) {

       

            System.out.print("Would you like to play: (YES/NO): ");

    

       

            String gameType = input.nextLine();

       

            if (gameType.equalsIgnoreCase("yes")) {

                chooseGame();

                break;

            

            } else if (gameType.equalsIgnoreCase("no")) {

       

                    quit();

       

                    break;

                

            }else{

       

                System.out.println("Only yes or no is allowed");

       

                continue;

            

            

            

            }

        }

       

        }

    public static void chooseGame() {

        Scanner GameChoice = new Scanner(System.in);

        System.out.println("GAME SELECTION MENU");

        System.out.println("MAKE SLECTION BY ENTERING A NUMBER 1-3");

        System.out.println("1 TIC TAC TOE");

        System.out.println("2 Guessing Game");

        System.out.println("3 RO SHAM BO");    

        System.out.print("WHAT GAME DO YOU CHOOSE: ");

        int Game = GameChoice.nextInt();

        if (Game == 1) {

            System.out.println("YOU HAVE CHOSEN OPTION 1");

            ticTactoe();

        }else if (Game == 2) {

            System.out.println("YOU HAVE CHOSEN OPTION 2");

            guessingGame();

        }else if (Game == 3) {

            System.out.println("YOU HAVE CHOSEN OPTION 3");

            roShambo();

        }else if(Game < 1 || Game > 3) {

            System.out.println("WE CURRENLTY DONT OFFER WHAT YOUR LOOKING. UPDATES WILL BE RELEASED SOON");

            chooseGame();

        //}else if (Game.ParseString()) if letter is entered 

        }else{

            System.out.print("PLEASE FOLLOW INSTRUCTIONS");

        }

        

    }

    public static void ticTactoe() {

        Scanner xoro = new Scanner(System.in);

        System.out.println("WELCOME TO TIC TAC TOE");

        System.out.println("THIS GAME IS WON BY GETTING THREE IN A ROW");

        System.out.println("WHETHER HORIZONTALLY, VERTICALLY OR DIAGNOLY");

        System.out.println("WOULD YOU LIKE TO BE X OR O");

        String gamePiece = xoro.nextLine();

        if (gamePiece.equalsIgnoreCase("X")) {

            System.out.println("YOU HAVE CHOSEN " + gamePiece);

        } else if (gamePiece.equalsIgnoreCase("O")) {

            System.out.println("YOU HAVE CHOSEN " + gamePiece);

        } else if (gamePiece.equalsIgnoreCase("quit")) {

            quit();

        } else {

            System.out.println("SELECTION MUST BE X OR O!!!");

            ticTactoe();

        }

    }

    

    /**public static void guessingGame() {

        //int Random = (int)(Math.random()*10.0);

        Scanner Entry = new Scanner(System.in);

        //WELCOME MESSAGE

        System.out.println("WELCOME TO THE GUESSING GAME");

        System.out.println("YOU DECIDE THE DIFFICULTY BY ENTERING THE RANGE OF NUMBERS");

        System.out.println("THE NUMBER YOU ENTER WILL RANGE 0 TO NUM-1");

        System.out.print("PICK YOUR DIFFICULTY: ");

        //CATCH DIFFICULTY

        int DifEntry = Input.nextInt();

        //BOTS INPUT

        int Bot = ((int)(Math.random()*DifEntry) + 1);

        //int Bot = 5;

        //TEST OUTPUT

        System.out.println(Bot);

        //LOOP FOR MAIN GAME

        while (true) {

            System.out.println("WHAT DO YOU GUESS: ");

            String userinput = Input.nextLine();

            try{

                int  guess = Integer.parseInt(userinput);

                if (guess == Bot) {

                    System.out.println(guess + " = " + Bot);

                    System.out.println("YOU WIN!!!");

                    break;

                }else {

                   // System.out.println("YOU LOSE");

                    System.out.print("TRY AGAIN :");

                    continue;

                }

            }catch (NumberFormatException e) {

               System.out.println("WRONG ENTRY ");

            }

        

        }

        Scanner playAgain = new Scanner(System.in);

        System.out.println("WOULD YOU LIKE TO PLAY AGAIN OR PLAY ANOTHER GAME: ");

        String rePlay = Input.nextLine();

        while (true) {

            if (rePlay.equalsIgnoreCase("PLAY AGAIN")) {

                guessingGame();

            }  else if (rePlay.equalsIgnoreCase("PLAY ANOTHER GAME")) {

                chooseGame();

            }

        }

        

        

        //int Random = (int)(Math.random()*10.0);

        //System.out.println(Random);

    }*/

    //game runs perfectly through normal test

   public static void guessingGame() {

        //int Random = (int)(Math.random()*10.0);

        Scanner Entry = new Scanner(System.in);

        //WELCOME MESSAGE

        System.out.println("WELCOME TO THE GUESSING GAME");

        System.out.println("YOU DECIDE THE DIFFICULTY BY ENTERING THE RANGE OF NUMBERS");

        System.out.println("THE NUMBER YOU ENTER WILL RANGE 0 TO NUM-1");

        System.out.print("PICK YOUR DIFFICULTY: ");

        //CATCH DIFFICULTY

        int DifEntry = Entry.nextInt();

        //add error if a dif char type is entered

        //int DifEntry = 5;

        

        //BOTS INPUT

        int Bot = ((int)(Math.random()*DifEntry) + 1) ;

        //int Bot = 5;

        //TEST OUTPUT

        System.out.println(Bot);

        //LOOP FOR MAIN GAME

        while (true) {

            Scanner Input = new Scanner(System.in);

            System.out.print("WHAT DO YOU GUESS: ");

            String userinput = Input.nextLine();

            try{

                int  guess = Integer.parseInt(userinput);

                if (guess == Bot) {

                    System.out.println(guess + " = " + Bot);

                    System.out.println("YOU WIN!!!");

                    break;

                }else {

                   // System.out.println("YOU LOSE");

                    System.out.println("TRY AGAIN");

                    continue;

                }

            }catch (NumberFormatException e) {

               System.out.println("WRONG ENTRY ");

            }

        

        }

        while (true) {

            Scanner playAgain = new Scanner(System.in);

            System.out.println("WOULD YOU LIKE TO PLAY AGAIN OR PLAY ANOTHER GAME: ");

            String rePlay = playAgain.nextLine();

            if (rePlay.equalsIgnoreCase("PLAY AGAIN")) {

                guessingGame();

            

            } else if (rePlay.equalsIgnoreCase("PLAY ANOTHER GAME")) {

               //chooseGame();

            } else {

                System.out.println("WRONG INPUT");

                quit();

                break;

            }

        }

    }

//end of guessingGame()

   

    public static void roShambo() {

        Scanner move = new Scanner(System.in);

        System.out.println("WELCOME TO RO-SHAM-BO OR ROCK PAPER SCISSORS");

        System.out.println("THE RULES ARE AS FOLLOWS:");

        System.out.println("PAPER BEATS ROCK, ROCK BEATS SCISSORS, SCISSORS BEATS PAPER");

        System.out.println("TIME TO BEGIN!!!");

        

        

        final String[] cPu = {"ROCK", "PAPER", "SCISSORS"};

        Random random = new Random();

        //int index = random.nextInt(cPu.length);

        //System.out.println(cPu[index]);

        System.out.println("ROCK, PAPER, SCISSORS, SHOOT!!!");

        int win = 0, lose = 0, ties = 0, x = 0;

        

        while ( true ) {
        	
            System.out.println("ROCK, PAPER, SCISSORS, SHOOT!!!");


            int index = random.nextInt(cPu.length);

            String computerMove = cPu[index];

            //String player = move.nextLine();

            String player = move.nextLine().toUpperCase();

            //System.out.println("YOU CHOSE " + player.toUpperCase());

            //System.out.println("YOU CHOSE " + player);

            //System.out.print(player);

            //if (Integer.parseInt(player) == index ) {

            if (player.equalsIgnoreCase(computerMove)) {

                System.out.println(player + " TIES " + computerMove);

                ties = ++ties;

                x = ++x;

                System.out.print(computerMove);

            }else if ((player.equalsIgnoreCase("SCISSORS") && computerMove.equals("PAPER")) || (player.equalsIgnoreCase("ROCK") && computerMove.equals("SCISSORS")) || (player.equalsIgnoreCase("PAPER") && computerMove.equals("ROCK"))) {

                win = ++win;

                x = ++x;

                System.out.println("Cpu chose " + computerMove);
                
                System.out.println("YOU WIN!!!");

            }else{

                System.out.print(computerMove);

                System.out.println("YOU LOSE!!!");

                lose = ++lose;

                x = ++x;

                continue;

            }

        }

        //System.out.println("YOU WON " + win + "TIMES");

        //System.out.println("YOU LOSE " + lose + "TIMES");

        //ystem.out.println("YOU TIED " + ties + "TIMES");

        //quit();

        //System.out.println("the end");

        

    }


        

        

    public static void quit() {

        System.out.println("ANOTHER TIME TRAVELER");

        System.out.println("Farewell!!!");

    }

}

    