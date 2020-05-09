//Question URL: https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {

        int cnt =0;
        for (int i =0; i< nums.length; i++) {
            if (nums[i] != 0){
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        while(cnt < nums.length) {
            nums[cnt] =0;
            cnt++;
        }
    }
}
//Time Complexity: O(N) -> where N is the number of elements in the array
//Space Complexity: O(1) -> in place
