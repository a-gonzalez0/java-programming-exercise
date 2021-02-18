package chapter4;
import java.util.Scanner;

/*
 * (Student major and status) Write a program that prompts the user to enter two
 * characters and displays the major and status represented in the characters. The
 * first character indicates the major and the second is a number character 1, 2, 3, or
 * 4, which indicates whether a student is a freshman, sophomore, junior, or senior.
 * 
 * Suppose that the following characters are used to denote the majors:
 * M: Mathematics
 * C: Computer Science
 * I: Information Technology
 * 
 * Here are sample runs:
 * 
 * Enter two characters: M1
 * Mathematics Freshman
 * 
 * Enter two characters: C3
 * Computer Science Junior
 * 
 * Enter two characters: T3
 * Invalid input
 */

public class Question18 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two characters
		System.out.print("Enter two characters: ");
		String majorStatus = input.next();
		
		if (majorStatus.startsWith("M")) {
			System.out.print("Mathematics");
		} else if (majorStatus.startsWith("C")) {
			System.out.print("Computer Science");
		} else if (majorStatus.startsWith("I")) {
			System.out.print("Information Technology");
		} else {
			System.out.print("Invalid input");
		}
		
		if (majorStatus.endsWith("1")) {
			System.out.print(" Freshman");
		} else if (majorStatus.endsWith("2")) {
			System.out.print(" Sophomore");
		} else if (majorStatus.startsWith("3")) {
			System.out.print(" Junior");
		} else if (majorStatus.endsWith("4")){
			System.out.print(" Senior");
		} else {
			System.out.print("Invalid input");
		}
	}
}
