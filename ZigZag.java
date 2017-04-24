/**
* Given an array of distinct elements, 
* rearrange the elements of array in zig-zag fashion in O(n) time. 
* The converted array should be in form a < b > c < d > e < f.
* Ex: Input: {4, 3, 7, 8, 6, 2, 1};
* 	  Output: {3, 7, 4, 8, 2, 6, 1}
* Source: GeeksforGeeks: Top 10 algorithms interview questions.
* Link: http://www.geeksforgeeks.org/convert-array-into-zig-zag-fashion/
**/

public class ZigZag {

	public static void main(String[] args) {
		int[] arr = {4, 3, 7, 8, 6, 2, 1};
		arr = zigZag(arr);
		System.out.print("Array is: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] zigZag(int[] arr) {
	
		int temp = 0;
		for(int i = 0; i < arr.length-2; i++) {
			if(i % 2 == 0) {
				if(arr[i+1] < arr[i]) {
					temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
				if(arr[i+1] < arr[i+2]) {
					temp = arr[i+1];
					arr[i+1] = arr[i+2];
					arr[i+2] = temp;
				}
			} else {
				if(arr[i+1] > arr[i]) {
					temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
				if(arr[i+1] > arr[i+2]) {
					temp = arr[i+1];
					arr[i+1] = arr[i+2];
					arr[i+2] = temp;
				}
			}
		}
		return arr;
	}
}