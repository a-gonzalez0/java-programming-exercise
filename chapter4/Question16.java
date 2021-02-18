package chapter4;

/*
 * (Random character) Write a program that displays a random uppercase letter
 * using the Math.random() method.
 */

public class Question16 {
	public static void main(String[] args) {
        // Generate a random integer from 0 - 26
        int randomNumber = (int)(Math.random() * 26);
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        // select a random character out of the alphabet and 
        // display print upper case
        System.out.println(Character.toUpperCase(alphabet.charAt(randomNumber)));
	}
}
