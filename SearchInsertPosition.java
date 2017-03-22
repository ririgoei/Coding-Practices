/**
* Source: LeetCode, Search Insert Position (Difficulty: Easy)
* Link: https://leetcode.com/problems/search-insert-position/#/description
* Given a sorted array and a target value, return the index if the target
* is found. If not, return the index where it would be if it were insterted
* in order. You may assume no duplicates in the array.
* Ex: [1,3,5,6], 5 -> 2
* [1, 3, 5, 6], 2 -> 1
*/

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        boolean found = false;
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]) {
                found = true;
                return i;
            }
        }
        
        if(!found){
            if(target < nums[0]) {
                return 0;
            }
            else if(target > nums[nums.length-1]) {
                return nums.length;
            }
            else{
                for(int i = 1; i < nums.length; i++){
                    if(target > nums[i-1] && target < nums[i]){
                        return i;
                    }       
                }
            }
        }
        return 0;
        
    }
}