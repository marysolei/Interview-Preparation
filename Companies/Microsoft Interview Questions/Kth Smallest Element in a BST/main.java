//Question Link: https://leetcode.com/problems/kth-smallest-element-in-a-bst/

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
    public int kthSmallest(TreeNode root, int k) {

        if (root == null || k ==0)return 0;
        List<Integer> arr = new ArrayList<>();
        helper(root, arr);
        return arr.get(k-1);
    }
    public void helper(TreeNode root ,List<Integer> arr ) {
        if (root == null)return;
        helper(root.left, arr);
        arr.add(root.val);
        helper(root.right, arr);
    }
}


//Time complexity : O(N) to build a traversal.
//Space complexity : O(N) to keep an inorder traversal. 
