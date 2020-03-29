//Question Link: https://leetcode.com/problems/detect-capital/

class Solution {
    public boolean detectCapitalUse(String word) {

        int cnt = 0 ;
        for (int i =0; i< word.length() ; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                cnt++;
            }
        }
        return cnt==0 || cnt== word.length() || (cnt ==1 && Character.isUpperCase(word.charAt(0)));
    }
}
