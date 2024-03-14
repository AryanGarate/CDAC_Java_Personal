/*Write a program that performs arithmetic operations involving different data types (int, double, float) 
and observes how Java handles widening conversions automatically. */

package day3;

import java.util.Scanner;

public class Ques_3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	 System.out.print("Enter an integer value: ");
     int intValue = scanner.nextInt();

     System.out.print("Enter a double value: ");
     double doubleValue = scanner.nextDouble();

     System.out.print("Enter a float value: ");
     float floatValue = scanner.nextFloat();

     scanner.close();

     double resultAddition = intValue + doubleValue + floatValue;
     double resultSubtraction = doubleValue - intValue - floatValue;
     double resultMultiplication = intValue * doubleValue * floatValue;
    

    
     System.out.println("Addition Result: " + resultAddition);
     System.out.println("Subtraction Result: " + resultSubtraction);
     System.out.println("Multiplication Result: " + resultMultiplication);
    
 }
}
