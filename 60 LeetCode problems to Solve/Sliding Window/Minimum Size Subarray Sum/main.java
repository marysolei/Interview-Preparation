//Question Link: https://leetcode.com/problems/minimum-size-subarray-sum/
class Solution {
    public int minSubArrayLen(int s, int[] nums) {

        int minlen = Integer.MAX_VALUE;
        int currsum = 0;
        int startWindow = 0;

        for (int endWindow = 0; endWindow < nums.length; endWindow++ ) {
            currsum += nums[endWindow];

            while (currsum >= s) {
                minlen = Math.min (minlen, endWindow - startWindow +1);
                currsum -= nums[startWindow] ;
                startWindow++;
            }
        }
        if (minlen == Integer.MAX_VALUE ) {
            return 0 ;
        }
        return minlen;
    }
}
