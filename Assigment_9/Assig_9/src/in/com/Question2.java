/*Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.*/


package in.com;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =18;
		tryNumber(n);
		n =7 ;
		tryNumber(n);

	}
	public static void tryNumber(int n) {
		try {
			checkEvenNumber(n);
			System.out.println(n + " is even.");
		}catch(IllegalArgumentException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
	public static void checkEvenNumber(int number) {
		if(number % 2 !=0) {
			throw new IllegalArgumentException(number + "is odd.");
		}
	}

}
