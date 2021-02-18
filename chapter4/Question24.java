package chapter4;
import java.util.Scanner;

/*
 * (Order three cities) Write a program that prompts the user to enter three cities
 * and displays them in ascending order. Here is a sample run:
 * 
 * Enter the first city: Chicago
 * Enter the second city: Los Angeles
 * Enter the third city: Atlanta
 * The three cities in alphabetical order are Atlanta Chicago Los Angeles
 */

public class Question24 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter first city
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		
		// Prompt user to enter second city
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();

		// Prompt user to enter third city
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();
		
		// city1 city2 city3
		if (city1.compareTo(city2) < 0 && city2.compareTo(city3) < 0) {
			System.out.println("The cities in alphabetical order are " +
					city1 + " " + city2 + " " + city3);
		} 
		// city1 city3 city2
		else if (city1.compareTo(city2) < 0 && city3.compareTo(city2) < 0) {
			System.out.println("The cities in alphabetical order are " +
					city1 + " " + city3 + " " + city2);
		} 
		// city2 city3 city1
		else if (city2.compareTo(city1) < 0 && city3.compareTo(city1) < 0) {
			System.out.println("The cities in alphabetical order are " +
					city2 + " " + city3 + " " + city1);
		} 
		// city2 city1 city3
		else if (city2.compareTo(city1) < 0 && city1.compareTo(city3) < 0) {
			System.out.println("The cities in alphabetical order are " +
					city2 + " " + city1 + " " + city3);
		} 
		// city3 city1 city2
		else if (city3.compareTo(city1) < 0 && city1.compareTo(city2) < 0) {
			System.out.println("The cities in alphabetical order are " +
					city3 + " " + city1 + " " + city2);
		}
		// city3 city2 city1
		else if (city3.compareTo(city1) < 0 && city2.compareTo(city1) < 0) {
			System.out.println("The cities in alphabetical order are " +
					city3 + " " + city2 + " " + city1);
		} else {
			System.out.println("Invalid input");
		}
	}
}
