// 448. Find All Numbers Disappeared in an Array
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
// Example 2:

// Input: nums = [1,1]
// Output: [2]
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        for(int i=1;i<nums.length+1;i++){
            s.add(nums[i-1]);
            if(i!=nums[i-1]){
                nums[i-1]=i;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(!s.contains(nums[j])){
                l.add(nums[j]);
            }
        }
        // for(int)
        return l;
    }
}
