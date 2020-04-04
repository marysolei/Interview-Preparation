//Question URL: https://leetcode.com/problems/decode-ways/

class Solution {
    public int numDecodings(String s) {

        //Using buttom-up process
        int[]dp = new int[s.length()+1];

        //number of ways to decode string of length 0
        dp[0]=1;
        dp[1]= s.charAt(0)=='0'?0:1; //we don't have any decoding for number 0 but for others we have one form of decoding

        for (int i=2;i<=s.length() ;i++) {

            int firstDigit = Integer.valueOf(s.substring(i-1,i));
            int twoDigits = Integer.valueOf(s.substring(i-2,i));
            if(firstDigit>=1 ) {
                dp[i]+=dp[i-1];
            }
            if (twoDigits >=10 && twoDigits<=26) {
                dp[i]+= dp[i-2];
            }
        }

        return dp[s.length()];
    }
}

//Time Complexity: O(N), where N is length of the string.
//Space Complexity: O(N). The length of the DP array. 
