//Question Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length ==0)return 0;

        int i=0 ;
        for (int j =1; j<nums.length; j++) {
            if (nums[i]== nums[j]){
                continue;
            } else {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}

//Time Complexity: O(N) where N is the length of the array
//Space Complexity: O(1)
