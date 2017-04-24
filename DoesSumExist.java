/**
* Given an array of integers and a number n, determine if two
* numbers exist in the array whose sum is equal to n.
* Ex: array = {5, 0, 1, 1, 7, 8} and sum = 12 will equal true
* because 5 + 7 = 12, but array = {5, 0, 1, 1, 6, 8} will return
* false.
* Source: friend's interview question.
**/

import java.util.*;

public class DoesSumExist {
	
	public static void main(String[] args) {
		int[] arr = {5, 0, 1, 1, 7, 8};
		int sum = 12;
		System.out.println(sumExists(sum, arr));
	}
	
	public static boolean sumExists(int sum, int[] arr) {
		boolean exists = false;
		HashMap<Integer, Integer> diff = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			diff.put(arr[i], i);
		}
		int diffNum = 0;
		for(int i = 0; i < arr.length; i++) {
			diffNum = sum - arr[i];
			if((diff.get(diffNum) != null) && (diff.get(diffNum) != i)) {
				exists = true;
			}
		}
		
		return exists;
	}

}

