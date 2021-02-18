package chapter4;
import java.util.Scanner;

/*
 * (Convert letter grade to number) Write a program that prompts the user to enter
 * a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3,
 * 2, 1, or 0. For other input, display invalid grade. Here is a sample run:
 * 
 * Enter a letter grade: B
 * The numeric value for grade B is 3
 * 
 * Enter a letter grade: T
 * T is an invalid grade
 */

public class Question14 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
		
        // Prompt user to enter a letter grade
        System.out.print("Enter a letter grade: ");
        String letter = input.next();
		
        switch(letter) {
            case "A": System.out.print("The numeric value for grade A is 4");  break;
            case "B": System.out.print("The numeric value for grade B is 3"); break;
            case "C": System.out.print("The numeric value for grade C is 2"); break;
            case "D": System.out.print("The numeric value for grade D is 1"); break;
            case "F": System.out.print("The numeric value for grade F is 0"); break;
            default: System.out.print(letter + " is an invalid grade");
        }
    }
}
