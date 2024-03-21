/*10) Given an array of integers, print whether the numbers are in ascending order or in descending order or in random order without sorting
 Input: [5,14,35,90,139] Output: Ascending 
 Input: [88,67,35,14,-12] Output: Descending
Input: [65,14,129,34,7] Output: Random 
*/

package in.com;

public class Ques_10 {
	 public static void checkOrder(int[] arr) {
	        boolean ascending = true;
	        boolean descending = true;

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > arr[i - 1]) {
	                descending = false;
	            } else if (arr[i] < arr[i - 1]) {
	                ascending = false;
	            }
	        }

	        if (ascending) {
	            System.out.println("ascending order.");
	        } else if (descending) {
	            System.out.println("descending order.");
	        } else {
	            System.out.println(" in random order.");
	        }
	    }

	    public static void main(String[] args) {
	        int[] array1 = {5,14,35,90,139};
	        int[] array2 = {88,67,35,14,-12};
	        int[] array3 = {65,14,129,34,7};

	        System.out.print("Array 1: ");
	        checkOrder(array1);
	        
	        System.out.print("Array 2: ");
	        checkOrder(array2);
	        
	        System.out.print("Array 3: ");
	        checkOrder(array3);
	    }
	}

