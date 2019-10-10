package main

//Question link: https://leetcode.com/problems/delete-node-in-a-linked-list/

func main() {

}

type ListNode struct {
	Val  int
	Next *ListNode
}

func deleteNode(node *ListNode) {

	if node != nil {
		node.Val = node.Next.Val
		node.Next = node.Next.Next
	}
}
