package main

import "math"

//Question link: https://leetcode.com/problems/find-mode-in-binary-search-tree/

func main() {

}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

var hmap map[int]int

func findMode(root *TreeNode) []int {
	hmap = map[int]int{}
	max := math.MinInt64
	res := []int{}
	if root == nil {
		return []int{}
	}
	if root.Left == nil && root.Right == nil {
		return []int{root.Val}
	}

	getmode(root)
	for _, e := range hmap {
		if e > max {
			max = e
		}
	}
	for i, v := range hmap {
		if v == max {
			res = append(res, i)
		}
	}
	return res
}
func getmode(root *TreeNode) {

	if root == nil {
		return
	}
	if _, ok := hmap[root.Val]; !ok {
		hmap[root.Val] = 1
	}
	hmap[root.Val]++
	getmode(root.Left)
	getmode(root.Right)
}
