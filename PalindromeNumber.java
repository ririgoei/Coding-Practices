/**
* Source: LeetCode, Palindrome Number (Difficulty: Easy)
* Link: https://leetcode.com/problems/palindrome-number/
* Determine whether an integer is a palindrome. Do this without extra space.
*/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String num = x + "";
        int halfSize = num.length()/2;
        int fullSize = num.length()-1;
        boolean isPalindrome = true;
        for(int i = 0; i < halfSize; i++){
            if(num.charAt(i) != num.charAt(fullSize-i)){
                isPalindrome = false;
            }
        }
        
        return isPalindrome;
    }
}