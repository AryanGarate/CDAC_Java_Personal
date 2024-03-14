/*Write a program that demonstrates widening conversion from int to double and prints the result. */

package day3;
import java.util.*;
public class Ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer value  : " );
        int integerValue = sc.nextInt();
        
        double doubleValue = integerValue ;
        
        System.out.println("Converted double value: " + doubleValue);
        
	}

}
