//Question Link: https://leetcode.com/problems/word-break/

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        if (s == null || s.length() ==0) return false ;
        int n = s.length();
        boolean[] memo = new boolean[n];

        for (int i =0; i< n; i++) {
            for (int j=0; j <=i; j++) {
                if (wordDict.contains(s.substring(j,i+1))) {
                    if (j==0 ||memo[j-1]){
                        memo[i]= true;
                        break;
                    }
                }
            }
        }
       return memo[n-1];

    }
} 
