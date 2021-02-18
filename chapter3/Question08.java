package chapter3;
import java.util.Scanner;

/*
 * (Sort three integers) Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order.
 */

public class Question08 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter three integers
		System.out.print("Enter three integers separated by space: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// Sort the numbers in increasing order
		int temp;
		if (number2 < number1 || number3 < number1)
		{
			if (number2 < number1)
			{
				temp = number1;
				number1 = number2;
				number2 = temp; 
			}
			if (number3 < number1)
			{
				temp = number1;
				number1 = number3;
				number3 = temp;
			}
		}
		if (number3 < number2)
		{
			temp = number2;
			number2 = number3;
			number3 = temp;
		}
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
	}
}
