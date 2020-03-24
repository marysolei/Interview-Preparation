//Question Link: https://leetcode.com/problems/sum-of-left-leaves/

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
    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null )return 0;

        int leftSide = sumOfLeftLeaves(root.left);
        int rightSide = sumOfLeftLeaves(root.right);
        //if root.left exists and it is a leaf
        if (root.left != null && root.left.left == null && root.left.right == null ){
            leftSide += root.left.val;
        }
        return leftSide + rightSide;
    }
}
