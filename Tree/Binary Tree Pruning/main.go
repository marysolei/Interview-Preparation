package main

//Question link: https://leetcode.com/problems/binary-tree-pruning/
func main() {

}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func pruneTree(root *TreeNode) *TreeNode {
	if root == nil {
		return nil
	}
	root.Left = pruneTree(root.Left)
	root.Right = pruneTree(root.Right)
	if root.Right == nil && root.Left == nil && root.Val == 0 {
		root = nil
	}
	return root
}
