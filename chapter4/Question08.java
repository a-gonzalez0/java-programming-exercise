package chapter4;
import java.util.Scanner;

/*
 * (Find the character of an ASCII code) Write a program that receives an ASCII code
 * (an integer between 0 and 127) and displays its character. Here is a sample run:
 * 
 * Enter an ASCII code: 69
 * The character for ASCII code 69 is E
 */

public class Question08 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
		
        // Prompt the user to enter an ASCII code
        System.out.print("Enter an ASCII code (an integer between 0 and 127): ");
        int ascii = input.nextInt();
        char c = (char) ascii;
		
        System.out.print("The character for ASCII code " + ascii + " is " + c);
    }
}
