/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //Question Link: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {

      if (nums.length == 0 )return null;
        return helper (nums, 0, nums.length -1 );
    }
    public TreeNode helper ( int[]nums , int left , int right ) {
        if (right < left) return null ;

        int mid= (left+right) /2 ;
        TreeNode res = new TreeNode (nums[mid]);
        res.left = helper(nums, left, mid-1);
        res.right = helper(nums, mid+1, right) ;
        return res ;
    }
}
