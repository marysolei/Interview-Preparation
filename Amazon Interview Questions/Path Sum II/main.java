//Question Link: https://leetcode.com/problems/path-sum-ii/


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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> res = new ArrayList<>();
        if (root == null )return res;
        List<Integer> current = new ArrayList<>();
        helper(root, res, current, sum);
        return res;
    }
    public void helper( TreeNode root ,List<List<Integer>> res , List<Integer> current, int sum ){
        if (root == null)return ;
        current.add(root.val);
        if (root.val == sum && root.left == null && root.right == null) {
            res.add(new ArrayList<> (current));
            return;
        }

            helper(root.left, res, new ArrayList<> (current), sum-root.val);
            helper(root.right, res, new ArrayList<> (current), sum-root.val);

    }
}

//Time Complexity: O(N^2) where N is the number of nodes in a tree. In the worst case, we could have a complete binary tree, then there would be N/2 leafs. For every leaf, we perform O(N) operation of copying over the pathNodes nodes to a new list to be added to the final result.
//Space Complexity: O(N).
