package chapter3;
import java.util.Scanner;

/*
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor–
 * rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and
 * a paper can wrap a rock.) The program randomly generates a number 0, 1, or
 * 2 representing scissor, rock, and paper. The program prompts the user to enter
 * a number 0, 1, or 2 and displays a message indicating whether the user or the
 * computer wins, loses, or draws. Here are sample runs:
 * 
 * scissor (0), rock (1), paper (2): 1
 * The computer is scissor. You are rock. You won
 * 
 * scissor (0), rock (1), paper (2): 2
 * The computer is paper. You are paper too. It is a draw
 */

public class Question17 {
	public static void main(String[] args) {
		// Generate random number between 0, 1, or 2
		int computer = (int)(Math.random() * 3);
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a number 0, 1, or 2
		System.out.print("scissor (0), rock (1), paper (2): ");
		int user = input.nextInt();
		
		// Display  result
		System.out.print("The computer is ");
		
		switch (computer) {
			case 0: System.out.print("scissor"); break;
			case 1: System.out.print("rock"); break;
			case 2: System.out.print("paper"); break;
		}
		
		System.out.print(". You are ");
		
		switch (user) {
			case 0: System.out.print("scissor"); break;
			case 1: System.out.print("rock"); break;
			case 2: System.out.print("paper"); break;
		}
		
		if (computer == user) {
			System.out.print(" too. It is a draw");
		}
		if ((computer == 0 && user == 1) || 
				(computer == 1 && user == 2) ||
				(computer == 2 && user == 0)) {
			System.out.print(". You won");
		}
		if ((computer == 0 && user == 2) ||
				(computer == 1 && user == 0) ||
				(computer == 2 && user == 1)) {
			System.out.print(". You lost");
		}
	}
}
