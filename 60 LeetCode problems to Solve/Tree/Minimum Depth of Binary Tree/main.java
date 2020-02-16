/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //Question Link: https://leetcode.com/problems/minimum-depth-of-binary-tree/
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int leftD = minDepth(root.left);
        int rightD = minDepth(root.right);
        if (leftD ==0 || rightD==0){
            return leftD+rightD+1;
        }
        if (leftD < rightD) {
            return leftD+1;
        }
        return rightD+1;
    }
}
