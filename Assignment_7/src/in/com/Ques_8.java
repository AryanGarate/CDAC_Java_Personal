/*Write a program which takes an array of integers and prints the running average of 3 consecutive integers. 
In case the array has fewer than 3 integers, there should be no output.
 Input: [5,14,35,89,140]
Output: [18, 46, 88] 
(Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...)

*/


package in.com;

public class Ques_8 {
public static void runningAverage(int[] arr) {
	if(arr.length< 3 ) {
		System.out.println("Input array has fewer than 3 integers , no outputs");
		return ;
	}
	for(int i = 0 ; i <= arr.length -3; i++ ) {
		int sum = arr[i] + arr[i+1] + arr[i + 2];
		int average =  sum / 3;
		System.out.println(average);
		if(i < arr.length - 3) {
			System.out.println(", ");
		}

	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {5 , 14, 35 , 89 ,104};
		System.out.print("[");
		runningAverage(input);
		System.out.println("]");

	}

}
