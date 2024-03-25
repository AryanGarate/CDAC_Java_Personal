/*3. Write a Java program throws an array index out of bound exception.
*/

package in.com;

public class Question3 {
public static void main(String[] args) {
	try {
		int[] numbers = {1,2, 3};
		
		int element = numbers[5];
		
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index is out of bounds");
	}
  }
}
