package main

//Question Link: https://leetcode.com/problems/convert-bst-to-greater-tree/

func main() {

}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

var sum int

func convertBST(root *TreeNode) *TreeNode {
	if root == nil {
		return nil
	}
	sum = 0
	helper(root)
	return root
}

func helper(root *TreeNode) {
	if root == nil {
		return
	}
	helper(root.Right)
	sum += root.Val
	root.Val = sum
	helper(root.Left)

}
