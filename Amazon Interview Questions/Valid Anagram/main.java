//Question Link: https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s== null || t == null)return s==t;
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c-'a'] ++;
        }
        for (char c : t.toCharArray()) {
            freq[c-'a']--;
        }
        for (int cnt : freq) {
            if (cnt !=0) return false;
        }
        return true;
    }
}

//Time Complexity: O(N) -> N is the number of elements in a string
//Space Complexity: O(1) constant memory
