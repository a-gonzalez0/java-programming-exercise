package chapter3;
import java.util.Scanner;

/*
 * (Game: heads or tails) Write a program that lets the user guess whether the flip
 * of a coin results in heads or tails. The program randomly generates an integer
 * 0 or 1, which represents head or tail. The program prompts the user to enter a
 * guess, and reports whether the guess is correct or incorrect.
 */

public class Question14 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to guess whether the flip of a coin is heads or tails
		System.out.print("Enter a number for coin flip. 1 for heads or 0 for tails: ");
		int coinFlip = input.nextInt();
		
		// Compute coin flip by randomizing the value
		int guess = (int) (Math.random() * 2);
		
		// Display the result
		System.out.print((coinFlip == guess)? "You guessed correctly": "Sorry, you guessed incorrectly");
	}
}
