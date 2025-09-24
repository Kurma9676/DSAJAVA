164. Maximum Gap
Solved
Medium
Topics
premium lock icon
Companies
Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return 0.

You must write an algorithm that runs in linear time and uses linear extra space.

 

Example 1:

Input: nums = [3,6,9,1]
Output: 3
Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.
Example 2:

Input: nums = [10]
Output: 0
Explanation: The array contains less than 2 elements, therefore return 0.
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        if(nums.length<2){
            return max;
        }
        else{
            for(int i=0;i<nums.length-1;i++){
                int newMax=Math.abs(nums[i]-nums[i+1]);
                if(newMax>max){
                    max=newMax;
                }
            }
        }
        return max;
    }
}
