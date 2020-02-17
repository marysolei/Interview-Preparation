//Question Link: https://leetcode.com/problems/permutations/

class Solution {
    public List<List<Integer>> permute(int[] nums) {

        if (nums.length ==0 ) return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper (nums, res, new ArrayList<>(), 0,used);
        return res ;
    }
    public void helper (int[] nums, List<List<Integer>> res , List<Integer> list, int ind,  boolean[] used) {
        //end of one of the sets need a new one
        if (nums.length == ind ) {
            res.add(new ArrayList<>(list));
            return;
        } else {
            //we want to add values
            for (int i=0; i< nums.length; i++ ){
                if (used[i] ==false){
                    list.add(nums[i]);
                    used[i]= true;
                    helper(nums, res, list,ind+1, used);
                    used[i]=false;
                    list.remove(list.size()-1);
                }

            }
        }
    }
}
