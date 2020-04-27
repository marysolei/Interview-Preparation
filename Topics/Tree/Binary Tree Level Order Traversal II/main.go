package main

//Question link:https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
func main() {

}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func levelOrderBottom(root *TreeNode) [][]int {
	res := [][]int{}
	if root == nil {
		return res
	}
	makeResDFS(root, 0, &res)
	for i := 0; i < len(res)/2; i++ {
		res[i], res[len(res)-i-1] = res[len(res)-i-1], res[i]
	}
	return res
}

func makeResDFS(root *TreeNode, depth int, res *[][]int) {
	if len(*res) <= depth {
		*res = append(*res, []int{})
	}
	(*res)[depth] = append((*res)[depth], root.Val)
	if root.Left != nil {
		makeResDFS(root.Left, depth+1, res)
	}
	if root.Right != nil {
		makeResDFS(root.Right, depth+1, res)
	}
}
