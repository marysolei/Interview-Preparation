https://leetcode.com/problems/longest-palindromic-substring/

class Solution {
    public String longestPalindrome(String s) {

        String res = "";
        //int maxlen=0;
        if (s== null || s.length() ==0 )return s;
        int n = s.length();
        boolean[][] memo = new boolean[n][n];
        for (int i=0; i< n ; i++) {
            memo[i][i]= true;
        }

            for (int i = n-1; i>=0; i--) {
                for (int j= i; j<n; j++) {

                    if (s.charAt(i) == s.charAt(j) &&  (j-i<3 || memo[i+1][j-1] )) {

                            memo[i][j]= true;
                            if (res == null || j-i+1>res.length()) {
                                res = s.substring(i,j+1);
                            }

                    }
                }
            }
        return res;
    }
}
