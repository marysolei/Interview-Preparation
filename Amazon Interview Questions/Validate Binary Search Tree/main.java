//Question Link: https://leetcode.com/problems/validate-binary-search-tree/

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
    public boolean isValidBST(TreeNode root) {

        if (root == null)return true;
        return helper(root, null, null);
    }
    public boolean helper(TreeNode root, Integer min, Integer max){
        if (root == null) return true;
        if ((min != null && root.val<= min) || (max!= null && max<=root.val)) return false;
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}

/*
one should keep both upper and lower limits for each node while traversing the tree, and compare the node value not with children values but with these limits.
*/

//Time complexity : O(N) we visit each node once.
//Space complexity : O(N) we keep up to the entire tree.
