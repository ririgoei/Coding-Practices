/**
 * Implement a method that, given a string with repeated characters, return
 * each distinct character and how many times they appear in the string.
 * Eg: string "aaa" has 3 a's, so it will return "a3". String "aabb" will
 * return "a2b2."
 * Source: question/challenge from a friend.
 */

import java.util.*;

public class CountAndSay {

	public static void main(String[] args) {
		String one = "aaa";
		String two = "aabbccc";
		String three = "aabbbccccc";
		System.out.println(countAndSay(one));
		System.out.println(countAndSay(two));
		System.out.println(countAndSay(three));
	}
	
	public static String countAndSay(String str) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		String finalStr = "";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			String curr = String.valueOf(str.charAt(i));
			if(!hashMap.containsKey(curr)) {
				hashMap.put(curr, count+1);
			} else {
				hashMap.put(curr, hashMap.get(curr) + 1);
			}
		}
		for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			finalStr += entry.getKey() + String.valueOf(entry.getValue());
		}
		
		if(finalStr.length() > str.length()) {
			return str;
		}
		
		return finalStr;
	}
}