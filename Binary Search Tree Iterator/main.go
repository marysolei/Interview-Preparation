package main

//Question Link:https://leetcode.com/problems/binary-search-tree-iterator/

func main() {

}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

type BSTIterator struct {
	sortedArr []int
	cnt       int
}

func Constructor(root *TreeNode) BSTIterator {
	var res []int
	inorder(root, &res)
	return BSTIterator{sortedArr: res, cnt: -1}
}

func inorder(root *TreeNode, res *[]int) {
	if root == nil {
		return
	}
	inorder(root.Left, res)
	*res = append(*res, root.Val)
	inorder(root.Right, res)
}

//return the next smallest number
func (this *BSTIterator) Next() int {
	if this.cnt+1 < len(this.sortedArr) {
		this.cnt++
	}
	return this.sortedArr[this.cnt]
}

/** @return whether we have a next smallest number */
func (this *BSTIterator) HasNext() bool {
	return this.cnt+1 < len(this.sortedArr)
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * obj := Constructor(root);
 * param_1 := obj.Next();
 * param_2 := obj.HasNext();
 */
