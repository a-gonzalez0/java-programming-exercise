package chapter4;
import java.util.Scanner;

/*
 * (Phone key pads) The international standard letter/number mapping found on the
 * telephone is shown below:
 * 
 * Write a program that prompts the user to enter a lowercase or uppercase letter 
 * and displays its corresponding number. For a nonletter input, display invalid
 * input.
 * 
 * Enter a letter: A
 * The corresponding number is 2
 * 
 * Enter a letter: a
 * The corresponding number is 2
 * 
 * Enter a letter: +
 * + is an invalid input
 */

public class Question15 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a letter
		System.out.print("Enter a letter: ");
		String letter = input.next();
		
		// Display the result
		switch(letter.toUpperCase()) {
		case "A": System.out.print("The corresponding number is 2"); break;
		case "B": System.out.print("The corresponding number is 2"); break;
		case "C": System.out.print("The corresponding number is 2"); break;
		case "D": System.out.print("The corresponding number is 3"); break;
		case "E": System.out.print("The corresponding number is 3"); break;
		case "F": System.out.print("The corresponding number is 3"); break;
		case "G": System.out.print("The corresponding number is 4"); break;
		case "H": System.out.print("The corresponding number is 4"); break;
		case "I": System.out.print("The corresponding number is 4"); break;
		case "J": System.out.print("The corresponding number is 5"); break;
		case "K": System.out.print("The corresponding number is 5"); break;
		case "L": System.out.print("The corresponding number is 5"); break;
		case "M": System.out.print("The corresponding number is 6"); break;
		case "N": System.out.print("The corresponding number is 6"); break;
		case "O": System.out.print("The corresponding number is 6"); break;
		case "P": System.out.print("The corresponding number is 7"); break;
		case "Q": System.out.print("The corresponding number is 7"); break;
		case "R": System.out.print("The corresponding number is 7"); break;
		case "S": System.out.print("The corresponding number is 7"); break;
		case "T": System.out.print("The corresponding number is 8"); break;
		case "U": System.out.print("The corresponding number is 8"); break;
		case "V": System.out.print("The corresponding number is 8"); break;
		case "W": System.out.print("The corresponding number is 9"); break;
		case "X": System.out.print("The corresponding number is 9"); break;
		case "Y": System.out.print("The corresponding number is 9"); break;
		case "Z": System.out.print("The corresponding number is 9"); break;
		default: System.out.print(letter + " is an invalid input");
		}
	}
}
