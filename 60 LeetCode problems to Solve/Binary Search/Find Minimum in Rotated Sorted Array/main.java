//Question Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    public int findMin(int[] nums) {

        if (nums.length==0) return -1;
        if (nums.length==1)return nums[0];
        return helper (nums, 0, nums.length-1);
    }
    public int helper (int[]nums, int start, int end){

       if (start> end) return nums[0];

        int mid = start +(end- start)/2;
        if (mid>0 && nums[mid-1] > nums[mid]){
            return nums[mid];
        }
        if (nums[mid]> nums[mid+1]) {
            return nums[mid+1];
        }
        if (nums[mid]< nums[end]){
            return helper (nums, start, mid-1);
        }
        return helper(nums, mid+1, end);

    }
}
