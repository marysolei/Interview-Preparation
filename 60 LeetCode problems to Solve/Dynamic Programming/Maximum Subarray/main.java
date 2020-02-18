//Question Link: https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
       if (nums.length ==0)return 0;
        int cursum =nums[0];
        int maxsum= nums[0];

        for (int i=1; i< nums.length; i++) {
            if (cursum<0) {
                cursum= nums[i];
            } else {
                cursum+= nums[i];
            }
            maxsum= Math.max(maxsum, cursum);
        }
        return maxsum;
    }

}
