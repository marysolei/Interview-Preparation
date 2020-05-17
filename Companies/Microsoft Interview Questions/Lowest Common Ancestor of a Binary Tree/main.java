//Question URL:https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

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

    if (root == null || root == p || root == q) return root;

    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    if(left == null && right == null) return null;
    else if(left != null && right != null) return root;
    else return left == null ? right : left;

}
}

//Time Complexity: O(N), where N is the number of nodes in the binary tree. In the worst case we might be visiting all the nodes of the binary tree.
//Space Complexity: O(N). because the maximum amount of space utilized by the recursion stack is N.
