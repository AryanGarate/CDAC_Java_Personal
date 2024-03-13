/* Write a program that takes a number representing a weekday (1-7) and prints the name of the 
weekday using switch-case. */

package day1;
import java.util.*;
public class Ques_4 {

	  public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter a input : ");
	        int input = in.nextInt();
	        
	        switch(input){
	            case 1: System.out.println("Monday");
	            break ;
	            case 2: System.out.println("Tuesday");
	            break ;
	            case 3: System.out.println("Wednesday");
	            break;
	            case 4: System.out.println("Thursday");
	            break;
	            case 5: System.out.println("Friday");
	            break;
	            case 6: System.out.println("Saturday");
	            break ;
	            case 7 :System.out.println("Sunday");
	            break;
	            default: System.out.println("Invalid range");
	        }
	        
	    }
	}