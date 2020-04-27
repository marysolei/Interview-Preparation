package main

//Question link: https://leetcode.com/problems/sum-of-left-leaves/

func main() {

}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func sumOfLeftLeaves(root *TreeNode) int {

	if root == nil {
		return 0
	}
	leftS := sumOfLeftLeaves(root.Left)
	rightS := sumOfLeftLeaves(root.Right)

	//make sure it is a leaf
	if root.Left != nil && root.Left.Left == nil && root.Left.Right == nil {

		leftS += root.Left.Val
	}
	return leftS + rightS

}
