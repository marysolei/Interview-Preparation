//Question Link: https://leetcode.com/problems/subsets/


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0 )return result;
        List<Integer> current = new ArrayList<>();
        helper(nums, result, current, 0) ;
        return result;
    }
    public void helper(int[]nums, List<List<Integer>> result, List<Integer> current, int index) {

        // add the current set to the result
        result.add(new ArrayList<>(current));
        //add numbers to the new set
        for (int i=index; i< nums.length; i++) {
             //add the current num
            current.add(nums[i]);
             //move forward with this new number
            helper(nums, result, current, i+1);
             //remove the last added num and make others
            current.remove(current.size()-1);
        }
    }
}
//Time complexity: O(n* (2^n)) -> make subsets and we need to copy them to a list
//Space Complexity: O(2^n) -> keep all subsets in a list
