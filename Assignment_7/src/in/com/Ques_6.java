/*6) .Print the third-largest number in an array without sorting it 
Input: [ 24,54,31,16,82,45,67]
Output: 54 (82 and 67 are the largest and second-largest)*/


package in.com;

public class Ques_6 {
	
	public static int checkThirdLargest(int [] arr){ 
		if(arr.length<3) {
			System.out.println("Array size is less than");
		
	    return -1;
		}
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num > first) {
				third = second ;
				second = first ;
				first = num ;
			}else if(num > second && num != first) {
				third = second ;
				second = num ;
			}else if(num > third && num != second && num != first) {
				third = num ;
			}
		}
		
		return third ;
	} 


	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] array = { 24,54,31,16,82,45,67};
		  int thirdLargest  = checkThirdLargest(array);
		  if(thirdLargest != -1)
			  System.out.println("Thired Largest element : " + thirdLargest);
		 // System.out.println(first);

	}

}
