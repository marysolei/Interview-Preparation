/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 // Question Link: https://leetcode.com/problems/binary-tree-level-order-traversal/

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        if ( root == null)return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        helper(root, res, 0);
        return res;
    }
    public void helper( TreeNode root, List<List<Integer>> res, int Depth) {
            if (root == null)return ;
        List<Integer> tmp = null;
        if (res.size() == Depth){
            tmp= new ArrayList<>();
            res.add(tmp);
        } else {
            tmp = res.get(Depth);
        }
        tmp.add(root.val);
        helper(root.left, res, Depth+1);
        helper(root.right, res, Depth+1);
    }
}
