package main

//Question Link: https://leetcode.com/problems/diameter-of-binary-tree/

func main() {

}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

var res int

func diameterOfBinaryTree(root *TreeNode) int {
	if root == nil {
		return 0
	}
	res = 0
	helper(root)
	return res

}

func helper(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := helper(root.Left)
	r := helper(root.Right)
	res = max(res, l+r)
	return max(l, r) + 1
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
