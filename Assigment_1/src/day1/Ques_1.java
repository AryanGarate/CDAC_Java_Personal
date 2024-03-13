/* 
  Write a program that takes a numerical grade as input and outputs the corresponding letter 
  grade using if-else statements.
*/
package day1;

import java.util.Scanner; 
public class Ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Marks: ");
        int mark = sc.nextInt();
        
        if(mark >=  90) {
        	System.out.println("Grade A");
        }else if(mark >=80){
        	System.out.println("Grade B");
        	
        }else if(mark >=70){
        	System.out.println("Grade C");
        	
        }else if(mark >=60){
        	System.out.println("Grade D");
        	
        }else if(mark >=50){
        	System.out.println("Grade E");;
        	
        }else {
        	System.out.println("Fail");
        }
        sc.close();
	}

}
