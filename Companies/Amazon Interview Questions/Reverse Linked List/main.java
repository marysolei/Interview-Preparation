//Question Link:https://leetcode.com/problems/reverse-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null)return head;
        Stack<Integer> myStack = new Stack<>();
        ListNode current = head;
        ListNode res = new ListNode(-1);
        ListNode tmp = res ;

        while (current!= null) {
            myStack.push(current.val) ;
            current= current.next;
        }

        while (!myStack.isEmpty()){
            tmp.next = new ListNode(myStack.pop());
            tmp=tmp.next;
        }
        return res.next;
    }
}

//Time Complexity: O(n) -> one pass
//Space Complexity: O(n) -> stack of n items 
