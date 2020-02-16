/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //Question Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)return 0;

        int leftSide = maxDepth(root.left);
        int rightSide= maxDepth(root.right);

        return Math.max(leftSide, rightSide) +1;
    }
}
