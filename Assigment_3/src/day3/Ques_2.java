/*Create a program that demonstrates narrowing conversion from double to int and prints the result. */

package day3;

import java.util.Scanner;

public class Ques_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double value  : " );
        double doubleValue = sc.nextDouble();
        
        int integerValue = (int)doubleValue ;
        
        System.out.println("Converted integer value: " + integerValue);
        
	}

}