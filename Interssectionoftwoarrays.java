// 349. Intersection of Two Arrays
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         Set<Integer> s=new HashSet<>();
//         Set<Integer> m=new HashSet<>();
//         for(int i:nums1){
//             s.add(i);
//         }
//         for(int j:nums2){
//             m.add(j);
//         }
//         int p=0;

//         int[] l= new int[s.size()];

//         for(int k:s){
//             if(m.contains(k)){
//                l[p++]=k ;
//             }
//         }
//         int[] n=new int[p];
//         int r=0;
//         for(int q:l){
//             if(q!=0){
//             n[r++]=q;}
//         }
//         return n;
//     }
// }

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert directly to int[]
        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }
}
