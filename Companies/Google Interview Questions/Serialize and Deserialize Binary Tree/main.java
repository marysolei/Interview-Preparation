//Question: https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return helper(root, "");
    }
    public String helper(TreeNode root, String res) {
        if (root == null){
            res+= "null,";
        }else {
            res += res.valueOf(root.val)+",";
            res = helper(root.left, res);
            res = helper(root.right, res);
        }
        return res;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] dataArr = data.split(",");
        List<String> res = new ArrayList<>(Arrays.asList(dataArr));
        return helper(res);
    }
    public TreeNode helper(List<String> res ){
        if (res.get(0).equals("null")) {
            res.remove(0);
            return null;
        }
        TreeNode root = new TreeNode (Integer.valueOf(res.get(0)));
        res.remove(0);
        root.left = helper(res);
        root.right = helper(res);
        return root;
    }
}
//Time complexity : in both serialization and deserialization functions, we visit each node exactly once, thus the time complexity is O(N), where N is the number of nodes

//Space complexity : in both serialization and deserialization functions, we keep the entire tree, thus O(N)


// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
