/*205. Isomorphic Strings
Solved
Easy
Topics
premium lock icon
Companies
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:

Input: s = "paper", t = "title"

Output: true*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> m=new HashMap<>();
        Set<Character> n=new HashSet();
        int i;
        for(i=0;i<s.length();i++){
            char c1 = s.charAt(i); // character from string s
        char c2 = t.charAt(i);
             if (m.containsKey(c1)) {
            if (m.get(c1) != c2) return false; // mismatch in mapping
        } else {
            if (n.contains(c2)) return false; // value already mapped by another key
            m.put(c1, c2);               // create new mapping
            n.add(c2);          // mark value as used
        }
    }

    return true;
    }
}
