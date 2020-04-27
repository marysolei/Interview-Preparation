//Question Link: https://leetcode.com/problems/binary-tree-paths/

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
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null )return result;
        dfs(root,result, "" );
        return result;
    }
    public void dfs(TreeNode root, List<String> result  , String path ) {
        path+= root.val;
        if (root != null && root.left == null && root.right == null){
            result.add(path);
            return;
        }
        if (root.left != null ) {
            dfs(root.left, result, path+"->");
        }
        if (root.right != null) {
            dfs(root.right , result, path+"->");
        }
    }
}
