//Question Link: https://leetcode.com/problems/generate-parentheses/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n==0) return res;
        helper(n, res, 0,0,"");
        return res;
    }
    public void helper(int n, List<String> res, int left, int right, String tmp){
        if (tmp.length()==2*n) {
            res.add(tmp);
            return;
        }
        if (left<n){
            helper(n,res,left+1, right, tmp+"(");
        }
        if (right<left){
            helper(n,res, left, right+1, tmp+")");
        }

    }

}
