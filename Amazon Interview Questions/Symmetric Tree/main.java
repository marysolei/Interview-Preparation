//Question Link: https://leetcode.com/problems/symmetric-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {

        if (root == null)return true;
        return helper(root.left, root.right);
    }
    public boolean helper(TreeNode leftNode, TreeNode rightNode){
        if (leftNode == null || rightNode == null)return leftNode== rightNode;
        if (leftNode.val != rightNode.val) return false;

        return helper(leftNode.left , rightNode.right) && helper(leftNode.right, rightNode.left);
    }
}
