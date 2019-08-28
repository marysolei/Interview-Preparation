package main

//Question Link:https://leetcode.com/problems/average-of-levels-in-binary-tree/

func main() {

}

type TreeNode struct {
	Val   int
	Right *TreeNode
	Left  *TreeNode
}

func averageOfLevels(root *TreeNode) []float64 {

	next := []*TreeNode{}
	current := []*TreeNode{}
	res := []float64{}
	if root == nil {
		return res
	}
	current = append(current, root)
	for len(current) != 0 {
		sum := 0
		for i := 0; i < len(current); i++ {
			sum += current[i].Val
			if current[i].Left != nil {
				next = append(next, current[i].Left)
			}
			if current[i].Right != nil {
				next = append(next, current[i].Right)
			}
		}
		res = append(res, float64(sum)/float64(len(current)))
		current = next
		next = []*TreeNode{}
	}
	return res

}
