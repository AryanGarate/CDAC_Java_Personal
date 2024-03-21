/*

1. Write a program to print elements of Array ? 
*/

package in.com;

import java.util.*;

public class Ques_1 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n ;
		int [] arr = new int [90];
		System.out.println("enter a number of element: ");
		n = sc.nextInt();
		for(int i = 0 ; i <=n ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ;i<=n;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
		
	}

}
