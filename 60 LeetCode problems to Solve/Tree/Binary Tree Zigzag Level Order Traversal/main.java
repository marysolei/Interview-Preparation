/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 //Question Link: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

            if (root == null)return new ArrayList<>();
             List<List<Integer>>  res = new ArrayList<>();
            helper (root, res, 0);
            return res;
        }
    public void helper (TreeNode root,  List<List<Integer>>  res, int depth){
        if (root == null)return;
        List<Integer> tmp = null ;
        if (res.size() == depth) {
            tmp = new ArrayList<>();
            res.add(tmp);
        } else {
            tmp = res.get (depth);
        }
        //tmp.add(root.val);
            if (depth %2!=0){
               tmp.add(0, root.val);
            }else {
               tmp.add(root.val);
            }
         helper(root.left, res, depth+1);
         helper(root.right, res, depth+1);

    }

}
