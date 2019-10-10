package main

//Question link: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

func main() {

}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func sortedArrayToBST(nums []int) *TreeNode {
	//root := &TreeNode{}
	if len(nums) == 0 {
		return nil
	}
	mid := (len(nums) / 2)
	return &TreeNode{
		Val:   nums[mid],
		Left:  sortedArrayToBST(nums[:mid]),
		Right: sortedArrayToBST(nums[mid+1:]),
	}
}
