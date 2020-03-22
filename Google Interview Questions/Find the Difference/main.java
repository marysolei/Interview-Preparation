//Question Link: https://leetcode.com/problems/find-the-difference/

class Solution {
    public char findTheDifference(String s, String t) {

        HashMap<Character, Integer> hmap = new HashMap<>();
        for (char c: s.toCharArray()) {
            hmap.put(c, hmap.getOrDefault(c,0)+1);
        }
        for (char c : t.toCharArray()) {
            if (!hmap.containsKey(c) || (hmap.containsKey(c) &&hmap.get(c) == 0))return c;
           else  hmap.put(c, hmap.get(c)-1);
        }
        return '!';
    }
}

//Time Complexity: O(n) where n is the length of longest string
//Space Complexity: O(m) where m is the length of String s
