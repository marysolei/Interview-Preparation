//Question Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/

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
    public int maxDepth(TreeNode root) {

        if (root == null) return 0;
        if (root!= null && root.left == null && root.right == null)return 1;
        int leftSide = maxDepth(root.left);
        int rightSide = maxDepth(root.right);
        return Math.max(leftSide, rightSide)+1;
    }
}

//Time Complexity: O(N) -> we need to traverse through all the nodes
//Space Complexity: O(N) -> stack calls
