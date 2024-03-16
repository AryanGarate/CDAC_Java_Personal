

/* Build a class Student which contains details about the Student and compile and run its 
instance.*/


package in.com;

import java.util.Scanner;


public class Students {

	private String name ;
	private int rollno ;
	private int marks ; 
	
	void accept_data() {
		Scanner sc =  new Scanner (System.in);
		System.out.print("Enter a name ");
		this.name = sc.nextLine();
		System.out.print("Enter a rollno ");
		this.rollno = sc.nextInt();
;			
		System.out.print("Enter a marks ");
		this.marks = sc.nextInt();
;		}
	void display_data() {
		System.out.printf("%-20s%-10d%-5d" , this.name ,this.rollno , this.marks);
	}
	


public static void main(String[] args) {
	// TODO Auto-generated method stub
      Students std =  new Students();
      std.accept_data();
      std.display_data();
      std.accept_data();
      std.display_data();
}
}
