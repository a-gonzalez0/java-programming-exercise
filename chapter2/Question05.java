package chapter2;

import java.util.Scanner;

/*
 * (Financial application: calculate tips) Write a program that reads the subtotal
 * and the gratuity rate, then computes the gratuity and total. For example, if the
 * user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 * as gratuity and $11.5 as total. Here is a sample run:
 * 
 * Enter the subtotal and a gratuity rate: 10 15
 * The gratuity is $1.5 and total is $11.5
 */

public class Question05 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter subtotal and gratuity rate
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		
		gratuity = (gratuity * subtotal) / 100;
		
		// Computes the gratuity and total
		double total = subtotal + gratuity;
		
		// Display the result
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
}
