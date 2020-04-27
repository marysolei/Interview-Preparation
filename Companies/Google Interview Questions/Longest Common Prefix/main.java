//Question Link: https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {

        String res = "";
        if (strs == null || strs.length == 0)return res;

        int index = 0;
        for (char c : strs[0].toCharArray()) {
            for (int i=1; i< strs.length ; i++) {

                if (index >= strs[i].length() || c!= strs[i].charAt(index)) return res;
            }
            res += c;
            index++;
        }
        return res;
    }
}

//Time Complexity : O(n) -> n is the number of all characters in the array
//Space Complexity: O(1) -> constant space is used
