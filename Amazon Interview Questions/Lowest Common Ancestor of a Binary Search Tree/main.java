//Question Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || p==null || q== null)return null;

        if (root.val >p.val && root.val > q.val ){
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val <p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p,q);
        }
        return root;
    }
}

//Time Complexity: O(N) worst case scenario we need to go through all the nodes
//Space Complexity: O(N) due to stack calls
