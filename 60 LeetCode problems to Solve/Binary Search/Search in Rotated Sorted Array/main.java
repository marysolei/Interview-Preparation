//Question Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    public int search(int[] nums, int target) {

        if (nums.length ==0 )return -1;
        if (nums.length == 1) {
            if (nums[0]==target) return 0;
        }
        return helper (nums, target, 0, nums.length-1) ;

    }

    public int helper (int[] nums, int target, int start, int end) {
            if (end<start) return -1;
        while (start<= end) {
        int mid = start+ (end - start)/2;
        if (nums[mid] == target) return mid;

        //left side
        if (nums[mid] >= nums[start]) {
            if (nums[mid]> target && target>= nums[start]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        //right side
        if (nums[mid] <= nums[end]){
            if (nums[mid]< target && target<= nums[end]) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        }
        return -1;
    }
}
