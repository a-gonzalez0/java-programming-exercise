package chapter3;
import java.util.Scanner;

/*
 * (Financial: compare costs) Suppose you shop for rice in two different packages.
 * You would like to write a program to compare the cost. The program prompts the
 * user to enter the weight and price of each package and displays the one with the
 * better price. Here is a sample run:
 * 
 * Enter weight and price for package 1: 50 24.59
 * Enter weight and price for package 2: 25 11.99
 * Package 2 has a better price.
 * 
 * Enter weight and price for package 1: 50 25
 * Enter weight and price for package 2: 25 12.5
 * Two packages have the same price.
 */

public class Question33 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the weight and price of package 1
		System.out.print("Enter weight and price for package 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		// Prompt the user to enter the weight and price of package 2
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		double package1 = price1 / weight1;
		double package2 = price2 / weight2;
		
		// Display the one with the better price
		if (package1 < package2) {
			System.out.print("Package 1 has a better price");
		} else if (package2 < package1) {
			System.out.print("Package 2 has a better price");
		} else {
			System.out.print("Two packages have the same price");
		}
	}
}
