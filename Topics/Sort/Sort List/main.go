package main

//Question Link: https://leetcode.com/problems/sort-list/

func main() {

}

type ListNode struct {
	Val  int
	Next *ListNode
}

func sortList(head *ListNode) *ListNode {

	if head == nil || head.Next == nil {
		return head
	}

	slow, fast := head, head.Next

	for fast.Next != nil && fast.Next.Next != nil {
		slow = slow.Next
		fast = fast.Next.Next
	}
	mid := slow.Next
	slow.Next = nil
	return mergeSort(sortList(head), sortList(mid))
}

func mergeSort(l1 *ListNode, l2 *ListNode) *ListNode {

	res := &ListNode{Val: 0}
	tmp := res
	for l1 != nil && l2 != nil {
		if l1.Val < l2.Val {
			tmp.Next = l1
			l1 = l1.Next
		} else {
			tmp.Next = l2
			l2 = l2.Next
		}
		tmp = tmp.Next
	}

	if l1 != nil {
		tmp.Next = l1
	}
	if l2 != nil {
		tmp.Next = l2
	}

	return res.Next
}

// func findmid(head *ListNode) *ListNode {

// }
