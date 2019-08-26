package main

import "math"

//Question link: https://leetcode.com/problems/balanced-binary-tree/

func main() {

}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func isBalanced(root *TreeNode) bool {

	_, ok := getDepth(root)

	return ok

}
func getDepth(root *TreeNode) (int, bool) {
	if root == nil {
		return 0, true
	}
	dl, okl := getDepth(root.Left)
	dr, okr := getDepth(root.Right)
	if !okl || !okr {
		return 0, false
	}
	if mathabs(dl-dr) > 1 {
		return 0, false
	}
	return int(math.Max(float64(dl+1), float64(dr+1))), true
}
func mathabs(i int) int {
	if i < 0 {
		return -i
	}
	return i
}
