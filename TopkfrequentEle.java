// 347. Top K Frequent Elements
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2

// Output: [1,2]

// Example 2:

// Input: nums = [1], k = 1

// Output: [1]

// Example 3:

// Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2

// Output: [1,2]
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int[] result=new int[k];

            for(int i=0;i<k;i++){
                Map.Entry<Integer, Integer> maxEntry =
    Collections.max(m.entrySet(), Map.Entry.comparingByValue());

int keyWithMaxValue = maxEntry.getKey();
                result[i]=keyWithMaxValue;
                m.remove(keyWithMaxValue);

            }

        return result;
    }
}
