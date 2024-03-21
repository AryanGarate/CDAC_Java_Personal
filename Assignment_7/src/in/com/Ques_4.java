/*

4)  Write a program to reverse an Array in java . 

*/

package in.com;
import java.util.*;
public class Ques_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int size  ;
       int[] arr = new int[50];
       Scanner sc=  new Scanner (System.in);
       System.out.println("Enter a size of array: ");
       size = sc.nextInt();
       for(int i= 0 ; i<=size ;i++) {
    	   arr[i] = sc.nextInt();
       }
       System.out.println("Araays : ");
       
       for(int i = 0 ;i<=size;i++) {
			System.out.println(arr[i]+ " ");
		}
       System.out.println("Reversed Araays : ");
       
       for (int i = size-1; i >= 0; i--) {  
           System.out.print(arr[i] + " ");  
       }  
       sc.close();
	}

}
