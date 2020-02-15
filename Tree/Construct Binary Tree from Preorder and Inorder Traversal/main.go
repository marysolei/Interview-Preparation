package main

//Question Link:https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

func main() {

}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func buildTree(preorder []int, inorder []int) *TreeNode {
	if len(preorder) == 0 || len(inorder) == 0 {
		return nil
	}
	value := preorder[0]
	root := &TreeNode{
		Val: value,
	}
	i := 0
	for i = 0; i < len(inorder); i++ {
		if inorder[i] == value {
			break
		}
	}
	root.Left = buildTree(preorder[1:i+1], inorder[:i])
	root.Right = buildTree(preorder[i+1:], inorder[i+1:])
	return root
}
