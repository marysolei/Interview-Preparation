//Question Link: https://leetcode.com/problems/combination-sum/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        if (candidates.length ==0 )return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper (candidates, target , res, new ArrayList<>(), 0);
        return res ;
    }

    public void helper( int[] candidates, int target ,List<List<Integer>> res, List<Integer> list, int ind) {

        if (target<0) return;
        else if (target == 0 ) res.add(new ArrayList<>(list));

       else{

        //add value
        for (int i=ind; i< candidates.length; i++){

            list.add(candidates[i]);
           helper(candidates, target-candidates[i], res, list, i);
            list.remove(list.size()-1);
        }
       }
    }
}
