/*)Write a program to merge two arrays of integers by reading one number at a time from each array until  one of the array is exhausted, and then concatenating the remaining numbers.
 Input: [23,60,94,3,102] and [42,16,74]
 Output: [23,42,60,16,94,74,3,102]
*/

package in.com;
import java.util.*;
public class Ques_7 {
	
	public static int[] merge(int[] arr1 , int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		int[] merged  = new int [len1 + len2];
		int i =0 , j = 0 ,k = 0;
		while(i<len1 && j < len2) {
			if(arr1[i] <= arr2[j]) {
				merged[k++] = arr1[i++];
			}else {
				merged[k++] = arr2[j++];
			}
		}
		
		while(i< len1) {
			merged[k++] = arr1[i++];
			
		}
		while(j<len2) {
			merged [k++] = arr2[j++];
		}
		return merged ;
		
	}
	public static void main(String[] args) {
		int[] arr1 = {23,60,94,3,102};
	    int[] arr2= {42,16,74};
	
	 int[] mergedArray = merge(arr1, arr2);
     
     System.out.println("Merged Array: " + Arrays.toString(mergedArray));
	}
	
	
	
}
