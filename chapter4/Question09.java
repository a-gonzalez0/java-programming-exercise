package chapter4;
import java.util.Scanner;

/*
 * (Find the Unicode of a character) Write a program that receives a character and
 * displays its Unicode. Here is a sample run:
 * 
 * Enter a character: E
 * The Unicode for the character E is 69
 */

public class Question09 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
		
        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
		 
        // Convert character to integer
        int unicode = (int) ch;
		
        // Display the result
        System.out.print("The Unicode for the character " +  ch + " is " + unicode);
    }
}
