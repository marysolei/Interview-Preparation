//Question Link: https://leetcode.com/problems/find-peak-element/

class Solution {
    public int findPeakElement(int[] nums) {

        if (nums == null || nums.length ==0) return -1;
        return bsearch(nums, 0, nums.length-1);
    }
    public int bsearch(int[] nums, int left, int right) {
        if (left>right)return -1;
        if (left == right)return left;
        int mid = (left+right)/2;
        if (nums[mid]>nums[mid+1]) {
            return bsearch(nums, left, mid);
        }
        return bsearch(nums, mid+1, right);
    }
}

//Time Complexity: O(logn)
//Space Complexity: O(logn) -> recursive calls

//Linear Solution:

/*
class Solution {
    public int findPeakElement(int[] nums) {

        if (nums== null || nums.length ==0)return -1;
        for (int i=0; i < nums.length-1 ; i++) {
            if ( nums[i]>nums[i+1])return i;
        }
        return nums.length-1;
    }
}

//Time Complexity: O(N) n is the size of array
//Space Complexity: O(1)
*/
