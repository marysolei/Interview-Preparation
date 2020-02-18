//Question Link: https://leetcode.com/problems/house-robber-ii/

class Solution {
    public int rob(int[] nums) {

        if (nums.length==0) return 0;
        if (nums.length==1) return nums[0];
        if (nums.length==2) return Math.max(nums[0], nums[1]);
        int n = nums.length;
        return Math.max( helper (nums, 0,n-2) , helper(nums, 1, n-1));
    }

    public int helper (int[]nums, int left, int right) {
        int[] memo = new int [nums.length];
        memo[0] = nums[left];
        memo[1] = Math.max(nums[left], nums[left+1]);

        for (int i=left+2; i<= right; i++){
            if (memo[i-left]==0){
            memo[i-left]= Math.max(memo[i-left-1], nums[i]+memo[i-left-2]);}
        }
        return memo[right-left];
    }
}
