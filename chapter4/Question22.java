package chapter4;
import java.util.Scanner;

/*
 * (Check substring) Write a program that prompts the user to enter two strings, and
 * reports whether the second string is a substring of the first string.
 * 
 * Enter string s1: ABCD
 * Enter string s2: BC
 * BC is a substring of ABCD
 * 
 * Enter string s1: ABCD
 * Enter string s2: BDC
 * BDC is not a substring of ABCD
 */

public class Question22 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two strings
		System.out.print("Enter string s1: ");
		String s1 = input.next();
		
		System.out.print("Enter string s2: ");
		String s2 = input.next();
		
		// Check if s2 is a subset of s1
		System.out.print(s2 + 
				((s1.contains(s2))? " is a substring of ": " is not a substring of ") + s1);
	}
}
