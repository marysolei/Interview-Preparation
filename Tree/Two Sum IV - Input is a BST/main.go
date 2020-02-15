package main

//Question Link:https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

func main() {

}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func findTarget(root *TreeNode, k int) bool {
	hmap := map[int]bool{}

	return dfs(root, hmap, k)
}
func dfs(node *TreeNode, hmap map[int]bool, target int) bool {
	if node == nil {
		return false
	}
	if _, ok := hmap[node.Val]; ok {
		return true
	}
	hmap[target-node.Val] = true
	return dfs(node.Left, hmap, target) || dfs(node.Right, hmap, target)
}
