//Question: https://leetcode.com/problems/string-compression/

class Solution {
    public int compress(char[] chars) {

        if (chars == null || chars.length == 0)return 0;
        int index =0;
        int i=0;
        while (i < chars.length){
            int j=i;
            while (j<chars.length && chars[i] == chars[j]) {
                j++;
            }
            chars[index++] = chars[i];
            if (j-i>1) {
            String len = j-i+"";
            for (char c : len.toCharArray()) {
                chars[index] =c;
                index++;
            }
            }
            i=j;
        }

       return index;
    }
}

//Time Complexity: O(N) where N is the number of chars in the array
//Space Complexity: O(1)
