package main

import "strconv"

//Question link: https://leetcode.com/problems/binary-tree-paths/
func main() {

}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func binaryTreePaths(root *TreeNode) []string {
	if root == nil {
		return []string{}
	}
	val := strconv.Itoa(root.Val)
	if root.Left == nil && root.Right == nil {
		return []string{val}
	}
	temp := []string{}
	res := []string{}
	res = append(res, binaryTreePaths(root.Left)...)
	res = append(res, binaryTreePaths(root.Right)...)
	for _, v := range res {
		temp = append(temp, val+"->"+v)
	}
	return temp
}
