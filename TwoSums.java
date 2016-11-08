/**
* Source: LeetCode, Two Sums (Difficulty: Easy)
* Link: https://leetcode.com/problems/two-sum/
* Given an array of integers, return indices of the two numbers
* such that they add up to a specific target. You may assume that
* each input would have exactly one solution.
* Ex: Given nums = [2, 7, 11, 15], target = 9, would return [0, 1].
*/

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    twoSum[0] = i;
                    twoSum[1] = j;
                }
            }
        }
        
        return twoSum;
        
    }
}