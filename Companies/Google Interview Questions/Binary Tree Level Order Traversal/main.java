//Question Link: https://leetcode.com/problems/binary-tree-level-order-traversal/

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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null)return result;
        List<Integer> current = new ArrayList<>();
        helper(root, result,current, 0 );
        return result;
    }

    public void helper(TreeNode root, List<List<Integer>> result, List<Integer> current , int level) {
        if (root == null)return ;
        if (level ==result.size()){
            current = new ArrayList<>();
            result.add(current);
        } else {
            current = result.get(level);
        }
        current.add(root.val) ;
        helper(root.left, result,current, level+1);
        helper(root.right, result, current, level+1);

    }
}

//Time complexity : O(N) since each node is processed exactly once.
//Space complexity : O(N) to keep the result which contains N node values. 
