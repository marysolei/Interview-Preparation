//Question Link: https://leetcode.com/problems/longest-increasing-subsequence/

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] memo = new int[nums.length];

        return helper (nums, memo);
    }
    int helper ( int[]nums, int[]memo ) {
        if (nums.length == 0) return 0;
        //int currmax =0 ;
        int resmax =1 ;
        memo[0] = 1 ;

        for (int i=1; i < memo.length; i++) {
           int  currmax=0;
            for (int j = 0; j<i; j++){
                if (nums[i]> nums[j]){
                currmax = Math.max(currmax, memo[j]);
                }
            }
            memo[i] = currmax+1;
            resmax = Math.max(resmax, memo[i]);

        }
        return resmax;
    }
}
