/*Write a Java program that throws an arithmetic exception and catch it using a try-catch block.*/


package in.com;

public class Question1 {
	public static int divideByZero() {
		int num  = 10 ;
		int den = 0 ;
		return num / den ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = divideByZero();
			System.out.println("Result: "+ result);
			
		}catch (ArithmeticException e) {
			System.out.println("An arithmeic exception occured: "+e.getMessage());
		}

	}

}
