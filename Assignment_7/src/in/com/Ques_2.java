/*2) Write a Java program to check the equality of two arrays?*/

package in.com;

import java.util.Arrays;

public class Ques_2 {

	public static void main(String[] args) {
      
		
		// TODO Auto-generated method stub

		 int[] array1 = {1,2,3,4,5,6,7}; 
		 int[] array2 = {1,2,3,4,5,6,7}; 
		 
		 boolean check = Arrays.equals(array1, array2);
		 if(check)
		 {
			 System.out.println("Arrays are equal.");
	        } else {
	            System.out.println("Arrays are not equal.");
	        }
	
	}



	
}