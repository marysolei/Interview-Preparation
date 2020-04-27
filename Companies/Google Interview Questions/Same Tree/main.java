//Question Link: https://leetcode.com/problems/same-tree/submissions/

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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p ==null || q== null)return p==q;
        if (p.val != q.val)return false;
        return (p.val == q.val ) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}

//Time Complexity: O(N) -> we need to check all the nodes
//Space Complexity: O(logN) for the best case in a balanced tree, and O(N) in worst case for a unbalanced tree for the stack calls.
