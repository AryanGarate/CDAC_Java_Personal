/*Write a program that takes a character as input and determines whether it’s a vowel or a 
consonant using if-else.*/

package day1;

import java.util.Scanner;

public class Ques_5 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		char y = 'a';
		
		if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
	            || y == 'u' || y == 'A' || y == 'E' || y == 'I'
	            || y == 'O' || y == 'U')
	            System.out.println("It is a Vowel.");
	        else {
	            System.out.println("It is a Consonant.");
	    }
	}
}
