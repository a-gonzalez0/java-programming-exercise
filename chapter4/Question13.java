package chapter4;
import java.util.Scanner;

/*
 * (Vowel or consonant?) Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant. For a nonletter input, display
 * invalid input. Here is a sample run:
 * 
 * Enter a letter: B
 * B is a consonant
 * 
 * Enter a letter: a
 * a is a vowel
 * 
 * Enter a letter: #
 * # is an invalid input
 */

public class Question13 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
		
        // Prompt user to enter a letter
        System.out.print("Enter a letter: ");
        String letter = input.next();
		
        // Check whether the letter is a vowel or consonant
        if (letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("E") || letter.equalsIgnoreCase("I") ||
            letter.equalsIgnoreCase("O") || letter.equalsIgnoreCase("U")) {
            System.out.print(letter + " is a vowel");
        } else if (letter.equalsIgnoreCase("B") || letter.equalsIgnoreCase("C") || letter.equalsIgnoreCase("D") ||
                   letter.equalsIgnoreCase("F") || letter.equalsIgnoreCase("G") || letter.equalsIgnoreCase("H") ||
                   letter.equalsIgnoreCase("J") || letter.equalsIgnoreCase("K") || letter.equalsIgnoreCase("L") ||
                   letter.equalsIgnoreCase("M") || letter.equalsIgnoreCase("N") || letter.equalsIgnoreCase("P") ||
                   letter.equalsIgnoreCase("Q") || letter.equalsIgnoreCase("R") || letter.equalsIgnoreCase("S") ||
                   letter.equalsIgnoreCase("T") || letter.equalsIgnoreCase("V") || letter.equalsIgnoreCase("W") ||
                   letter.equalsIgnoreCase("X") || letter.equalsIgnoreCase("Y") || letter.equalsIgnoreCase("Z")) {
            System.out.print(letter + " is a consonant");
        } else {
            System.out.print(letter + " is an invalid input");
        }
    }
}
