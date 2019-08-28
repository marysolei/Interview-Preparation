package main

//Question Link: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

func main() {

}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func zigzagLevelOrder(root *TreeNode) [][]int {

	if root == nil {
		return [][]int{}
	}
	res := [][]int{}
	dfs(root, 0, &res)
	return res
}

func dfs(root *TreeNode, cnt int, res *[][]int) {
	if root == nil {
		return
	}
	if cnt%2 == 1 {
		(*res)[cnt] = append([]int{root.Val}, (*res)[cnt]...)
	} else {
		(*res)[cnt] = append((*res)[cnt], root.Val)
	}
	if root.Left != nil {
		dfs(root.Left, cnt+1, res)
	}
	if root.Right != nil {
		dfs(root.Right, cnt+1, res)
	}
}
