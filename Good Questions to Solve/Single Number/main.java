//Question Link: https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1)return nums[0];
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}

//Time Complexity: O(n) -> go through the array of length n
//Space Complexity: O(1)
