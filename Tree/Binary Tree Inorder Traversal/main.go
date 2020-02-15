package main

//Question Link: https://leetcode.com/problems/binary-tree-inorder-traversal/

func main() {

}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func inorderTraversal(root *TreeNode) []int {
	if root == nil {
		return []int{}
	}
	res := make([]int, 0)
	dfs(root, &res)
	return res
}
func dfs(root *TreeNode, res *[]int) {
	if root.Left != nil {
		dfs(root.Left, res)
	}
	*res = append(*res, root.Val)
	if root.Right != nil {
		dfs(root.Right, res)
	}
}
