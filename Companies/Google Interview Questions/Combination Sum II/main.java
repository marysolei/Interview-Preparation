//Question Link: https://leetcode.com/problems/combination-sum-ii/

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length ==0) return result;
        Arrays.sort(candidates);
        List<Integer> current = new ArrayList<>();
        helper(candidates, target, current, result, 0);
        return result;

    }

    public void helper(int[] candidates, int target,List<Integer>current, List<List<Integer>> res , int index ){

        if (target== 0){
            res.add(new ArrayList<>(current)) ;
            return;
        }
        if (target<0)return;

        for (int i=index; i<candidates.length; i++) {
            if (i==index || candidates[i]!= candidates[i-1]) {
                current.add(candidates[i]);
                helper(candidates, target-candidates[i], current, res, i+1);
                current.remove(current.size()-1);
            }
        }

    }
}
