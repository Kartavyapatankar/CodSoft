package com.numbergame;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  Random random=new Random();
	  int minRange=1;  
	  int maxRange=100;
	  int maxRounds=10;
	 
	  boolean playAgain=true;
	  while(playAgain) {
		  int targetNumber = random.nextInt(maxRange-minRange+1)+minRange;
		  System.out.println("Welcome to Number Game");
		  System.out.println("I'm thinking of a number between" + minRange + "and " + maxRange);
		  System.out.println("Can you guess it?");
		  int rounds =0;
		  boolean correctGuess=false;
		  while(rounds< maxRounds) {
			  System.out.println("Enter you guess:");
			  int userGuess=sc.nextInt();
			  rounds++;
			  
			  if(userGuess==targetNumber) {
				  System.out.println("Congratulation ! Your guessed the correct number in  " +  rounds  + "  attempts. ");
				  correctGuess=true;
				  break;
			  } else if(userGuess< targetNumber) {
				  System.out.println("Too low. Try again.");
			  } else {
				  System.out.println("Too high. Try again.");
			  }
		  }
		  if(!correctGuess) {
			  System.out.println("Sorry,you couldn't guess the number. It was" + targetNumber);
		  }
		  
		  System.out.println("Round Over");
		
		  System.out.println("Do you want to play again? (yes/no):");
		  String playAgainResponse=sc.next();
		  playAgain = playAgainResponse.equalsIgnoreCase("Yes");
	  }
	  System.out.println("Game over. Thank You for Playing! ");
  }
}
