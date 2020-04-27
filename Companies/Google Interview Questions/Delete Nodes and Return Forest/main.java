//Question Link: https://leetcode.com/problems/delete-nodes-and-return-forest/

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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        List<TreeNode> res = new ArrayList<>();
        if (root == null)return res;
        Set<Integer> deleteSet = new HashSet<>();
        for (int i:to_delete  ) {
            deleteSet.add(i);
        }

        helper(root, res, deleteSet);

        //we will go down till the end of the tree and then bubble up to look for nodes we need to delete. so when we are done with the helper the only remaining node to check is root =>
        if (!deleteSet.contains(root.val)) {

            res.add(root);
        }
        return res;
    }
    public TreeNode helper( TreeNode root, List<TreeNode> res, Set<Integer> deleteSet){
        //if we are at the leaves
        if (root == null)return null;
        //go down to the leaves
        root.left = helper(root.left, res, deleteSet);
        root.right = helper(root.right, res, deleteSet);
        //when you get to the leaves check if root node needs to be deleted and then bubble up
        if (deleteSet.contains(root.val)){
            //root node needs to be deleted but before that we need to check for any left or right child
            if (root.left != null) {
                res.add(root.left);
            }
            if (root.right != null){
                res.add(root.right);
            }
            //removing the root node by returning null
            return null;
        }
        //otherwise no need to delete root node => return root
        return root;
    }
}


//Time Complexity: O(N) we need to traverse through all nodes in the tree

//Space Complexity: O(N+m) where N is the number of nodes in the tree and m is the number of values in to_delete hashset, since the number of nodes is greater than the ones to delete we can say it is O(N)
