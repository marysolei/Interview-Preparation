//Question Link: https://leetcode.com/problems/range-sum-of-bst/

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
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum =0;
        if (root == null) return sum;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode current = queue.remove();
            if (current.val>=L && current.val <= R) {
                sum+= current.val;
            }
            if (current.left != null && current.val >L) {
                queue.add(current.left);
            }
            if (current.right != null && current.val < R) {
                queue.add(current.right);
            }
        }
        return sum;
    }
}

//Time Complexity: O(N) -> N is the number of nodes in tree
//Space Complexity: O(N)
