package chapter4;
import java.util.Scanner;

/*
 * (Process a string) Write a program that prompts the user to enter a string and
 * displays its length and its first character.
 */

public class Question20 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String s = input.next();
		
		// Display the result
		System.out.println("The length of the string is " + s.length());
		System.out.println("The first character of the string is " + s.charAt(0));
	}
}
