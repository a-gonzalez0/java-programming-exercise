package chapter3;
import java.util.Scanner;

/*
 * (Palindrome integer) Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome integer. An integer is palindrome
 * if it reads the same from right to left and from left to right. A negative integer is
 * treated the same as a positive integer. Here are sample runs of this program:
 * 
 * Enter a three-digit integer: 121
 * 121 is a palindrome
 * 
 * Enter a three-digit integer: 123
 * 123 is not a palindrome
 */

public class Question12 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a three-digit integer
		System.out.print("Enter a three-digit integer: ");
		int palindrome = input.nextInt();
		
		// Extract the digits from the integer
		int number1 = palindrome / 100;
		int remainingDigits = palindrome % 100;
		int number2 = remainingDigits / 10;
		remainingDigits %= 10;
		int number3 = remainingDigits;
		
		// Determine if number is a palindrome integer and display results
		if (number1 == number3) {
			System.out.print(palindrome + " is a palindrome");
		} else {
			System.out.print(palindrome + " is not a palindrome");
		}
	}
}
