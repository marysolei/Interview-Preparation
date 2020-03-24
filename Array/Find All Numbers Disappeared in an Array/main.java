//Question Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> res = new ArrayList<>();
        for ( int i=0; i< nums.length; i++ ) {

            int newIndex = Math.abs(nums[i]) -1;
            if (nums[newIndex] >0) nums[newIndex]*=-1;

        }
        for (int i=1; i<= nums.length; i++){
            if (nums[i-1] >0) res.add(i);
        }
        return res;
    }
}




//Time Complexity: O(N)
//Space Complexity: O(1) in place

/*
Algorithm:

1) Iterate over the input array one element at a time.
2) For each element nums[i], mark the element at the corresponding location negative if it's not already marked so i.e. nums[nums[i]−1]×−1 .
3) Now, loop over numbers from 1⋯N and for each number check if nums[j] is negative. If it is negative, that means we've seen this number somewhere in the array.
4) Add all the numbers to the result array which don't have their corresponding locations marked as negative in the original array.
*/
