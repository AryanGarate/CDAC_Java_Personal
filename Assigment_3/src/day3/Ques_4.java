/*Write a Program that demonstrates widening conversion from int to (double,float, boolean, string) and 
prints the result*/

package day3;

import java.util.Scanner;

public class Ques_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer value  : " );
        int integerValue = sc.nextInt();
        
        double doubleValue = integerValue ;
        
        float floatValue = integerValue ;
        boolean boolValue = integerValue != 0 ;
        
        //String stringValue = Integer.toString(integerValue);
        
        String stringValue = String.valueOf(integerValue);


        
        System.out.println("Converted double value: " + doubleValue);

        System.out.println("Converted float value: " + floatValue);
        

        System.out.println("Converted boolean value: " + boolValue);
        

        System.out.println("Converted String value: " + stringValue);
        
	}

}


