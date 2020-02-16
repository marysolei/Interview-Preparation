/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //Question Link: https://leetcode.com/problems/validate-binary-search-tree/
class Solution {
    public boolean isValidBST(TreeNode root) {


        if (root == null) return true;
        return helper(root, null, null);
    }
    public boolean helper (TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if ((min != null && root.val <= min) || ( max != null &&root.val>= max )) return false;
        return helper (root.left, min, root.val) && helper(root.right , root.val, max);
    }
}
