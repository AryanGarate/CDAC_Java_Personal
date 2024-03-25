/*4. Write a code for arithmetic exception using one try block & multiple catch block & check which catch block handle that exception.*/

package in.com;

public class Question4 {
	public static int divideByZero() {
		int num  = 10 ;
		int den = 0;
		return num / den ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = divideByZero();
			System.out.println("Result: "+ result);
			
		}catch (ArithmeticException e) {
			System.out.println("An arithmeic exception occured: "+e.getMessage());
		}catch(Exception e) {
			System.out.println("Exception caught: " +e.getMessage());
		}

	}

}
