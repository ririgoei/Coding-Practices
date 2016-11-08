import java.util.ArrayList;
/**
 * Source: Cracking the Coding Interview, Chapter 1: Arrays and Strings
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 * @author Riadiani Marcelita
 *
 */

public class UniqueStrings {

	public static void main(String[] args){
		
		String s1 = "Hello World";
		String s2 = "A Bee";
		String s3 = "Another Example";
		isUnique(s1);
		isUnique(s2);
		isUnique(s3);
		ArrayList<String> newAr = new ArrayList<>();
	}
	
	public static boolean isUnique(String s){
		boolean isUnique = true;
		s = s.trim();
		s = s.toLowerCase();
		String sCopy = "";
		for(int i = 0; i < s.length(); i++){
			String sCurrent = s.charAt(i) + "";
			if(sCopy.length() > 0){
				if(sCopy.contains(sCurrent)){ 
					isUnique = false; 
					break; }
			}
			if(isUnique) { 
				sCopy += sCurrent; 
				}
			else
				break;
		}
		
		System.out.println(isUnique);
		return isUnique;
	}
}
