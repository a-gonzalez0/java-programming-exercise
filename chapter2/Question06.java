package chapter2;

import java.util.Scanner;

/*
 * (Sum the digits in an integer) Write a program that reads an integer between 0
 * and 1000 and adds all the digits in the integer. For example, if an integer is 932,
 * the sum of all its digits is 14.
 * 
 * Hint: Use the % operator to extract digits, and use the / operator to remove the
 * extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 * 
 * Here is a sample run:
 * 
 * Enter a number between 0 and 1000: 999
 * The sum of the digits is 27
 */

public class Question06 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter a number between 0 and 1000
		System.out.print("Enter a number between 0 and 1000: ");
		int num = input.nextInt();
		
		// Extract the digits from num
		int n1 = num / 1000; // returns 0
		int n2 = (num % 1000) / 100; // returns 9
		int n3 = (num % 1000) % 100 / 10; // returns 9
		int n4 = (num % 1000) % 100 % 10; // returns 9
		
		int sumDigits = n1 + n2 + n3 + n4;
		
		// Display the result
		System.out.print("The sum of the digits is " + sumDigits);
	}
}
