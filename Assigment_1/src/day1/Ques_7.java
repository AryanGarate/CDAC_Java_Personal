/* Implement a program that calculates the Body Mass Index (BMI) based on height and weight 
input using if-else to classify the BMI int categories (underweight, normal weight, overweight, 
etc.)
}*/

package day1;
import java.util.*;
public class Ques_7 {
	 public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter weight in kilogram: ");
	      double weight = sc.nextDouble();
	      System.out.print("Enter height in meters: ");
	      double height = sc.nextDouble();
	      double BMI = weight / (height * height);
	      System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");
	      
	      if (BMI < 18.5) {
	          System.out.println("Underweight");
	      }
	      else if (BMI < 25) {
	          System.out.println("Normal");
	      }
	      else if (BMI < 30) {
	    	  System.out.println("Overweight");
	      }
	      else {
	    	  System.out.println("Obese");
	      }
	  }
	   }
	

