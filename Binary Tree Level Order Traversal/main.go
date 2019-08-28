package main

//Question Link: https://leetcode.com/problems/binary-tree-level-order-res/

func main() {

}

type TreeNode struct {
	Val   int
	Right *TreeNode
	Left  *TreeNode
}

func levelOrder(root *TreeNode) [][]int {

	if root == nil {
		return nil
	}
	res := make([][]int, 0)
	tmpqueue := []*TreeNode{root}

	level := 0
	for len(tmpqueue) > 0 {
		currentLen := len(tmpqueue)
		for i := 0; i < currentLen; i++ {
			node := tmpqueue[0]
			tmpqueue = tmpqueue[1:]
			if node.Left != nil {
				tmpqueue = append(tmpqueue, node.Left)
			}
			if node.Right != nil {
				tmpqueue = append(tmpqueue, node.Right)
			}
			if len(res) <= level {
				res = append(res, []int{node.Val})
			} else {
				res[level] = append(res[level], node.Val)
			}
		}
		level++
	}
	return res

}
