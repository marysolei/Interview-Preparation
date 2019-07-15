package main

//Question link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

func main() {

}

type ListNode struct {
	Val  int
	Next *ListNode
}

func deleteDuplicates(head *ListNode) *ListNode {

	if head == nil {
		return nil
	}
	current := head
	for current != nil && current.Next != nil {
		if current.Val == current.Next.Val {
			current.Next = current.Next.Next

		} else {
			current = current.Next
		}
	}
	return head
}
