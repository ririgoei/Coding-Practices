/**
 * String compression: Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the 
 * "compressed" string would not become smaller than the original string, your method should
 * return the original string. You can assume the string has only uppercase and lowercase letters
 * (a - z).
 * Source: Cracking the Coding Interview Book, Chapter 1, 6th Edition.
 */

public class CompressedString {

	public static void main(String[] args) {
		String one = "aabbbcccccaaa";
		String two = "aa";
		String three = "aabb";
		System.out.println(compressedString(one));
		System.out.println(compressedString(two));
		System.out.println(compressedString(three));
	}
	
	public static String compressedString(String str) {
		String finalStr = "";
		int count = 1;
		for(int i = 0; i < str.length(); i++) {
			String curr = String.valueOf(str.charAt(i));
			if(i == 0) {
				finalStr += curr;
			} else {
				String before = String.valueOf(str.charAt(i-1));
				if(curr.equals(before)) {
					count++;
					if(i == str.length()-1) {
						finalStr += count;
					}
				} else {
					finalStr += count + curr;
					count = 1;
				}
			}
		}
		
		if(finalStr.length() > str.length()) {
			return str;
		}
		return finalStr;
		
	}
}

