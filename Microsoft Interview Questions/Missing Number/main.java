//Question Link: https://leetcode.com/problems/missing-number/

class Solution {
    public int missingNumber(int[] nums) {
        int result = nums.length ;
        for ( int i=0; i< nums.length; i++) {
            result ^= (i^nums[i]);
        }
        return result;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)


//Another way:
/*public int missingNumber(int[] nums) {
        int result = 0 ;
        int n = nums.length+1;
        for (int num: nums) {
            result += num;
        }
        return (n*(n-1)/2) - result;
    }
*/
