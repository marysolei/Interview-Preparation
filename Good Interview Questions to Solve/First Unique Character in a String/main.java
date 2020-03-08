//Question Link: https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
     if (s.length () == 0)return -1;
        Map<Character , Integer> freq = new HashMap <>();
        for (int i =0 ; i< s.length() ; i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        for (int i=0; i< s.length(); i++) {
            if (freq.get(s.charAt(i)) ==1) return i;
        }
        return -1;
    }
}
//Time Complexity: O(n) n-> is the length of string
//Space Complexity: O(n)
