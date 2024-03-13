package day1;

import java.util.Scanner;

public class Ques_3 {

	public static void main(String[] args)
    {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Year : ");
	                int year = sc.nextInt();
        //Write your logic here
        if(year % 4 == 0){
            
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap Year");
                }else{
                    System.out.println("`Not Leap Year");
                }
            }else{
                System.out.println("Leap Year");
            }
        }else{
            System.out.println("Not Leap Year");
        }
        sc.close();
    }
}