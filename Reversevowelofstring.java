// 345. Reverse Vowels of a String
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

// Example 1:

// Input: s = "IceCreAm"

// Output: "AceCreIm"

// Explanation:

// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

// Example 2:

// Input: s = "leetcode"

// Output: "leotcede"
class Solution {
    public String reverseVowels(String s) {
        StringBuilder m=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char n=s.charAt(i);
            if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U'){
                m.append(n);
            }
        }
        m.reverse();
        for(int j=0;j<s.length();j++){
            char l=s.charAt(j);
            if(l!='a'&&l!='e'&&l!='i'&&l!='o'&&l!='u'&&l!='A'&&l!='E'&&l!='I'&&l!='O'&&l!='U'){
                m.insert(j,l);
            }
        }
        return m.toString();
    }
}
