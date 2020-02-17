//Question Link: https://leetcode.com/problems/subsets/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, nums, new ArrayList<>(), 0);
        return res;

    }

   public void helper( List<List<Integer>> res, int[] nums,List<Integer> current, int index ){
        // add the current set to the result
        res.add(new ArrayList<>(current));
        //add numbers to the new set
        for (int i= index; i<nums.length; i++) {
            //add the current num
            current.add(nums[i]);
            //move forward with the new number
            helper (res, nums, current, i+1);
            //remove the last added num and make others
            current.remove(current.size()-1);
        }
    }
}
