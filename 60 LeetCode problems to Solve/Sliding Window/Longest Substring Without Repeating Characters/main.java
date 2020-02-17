//Question Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {


        int maxLen = 0;
        int startw = 0 ;
        Map <Character, Integer> hmap = new HashMap<>();

        for (int endw =0; endw< s.length(); endw++){

            char c = s.charAt(endw);

            if (hmap.containsKey(c)){
                startw = Math.max(hmap.get(c)+1, startw);
            }
             maxLen= Math.max(maxLen, endw-startw+1);
             hmap.put(c, endw);
        }
        return maxLen;
    }
}
