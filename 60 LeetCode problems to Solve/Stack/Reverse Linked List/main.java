/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 //Question Link:https://leetcode.com/problems/reverse-linked-list/
class Solution {
    public ListNode reverseList(ListNode head) {
        if ( head == null || head.next == null) return head;
        Stack<ListNode> st = new Stack<>();
        ListNode current = head;
        ListNode res = new ListNode(0);
        ListNode tmp = res;
        while (current != null) {
            st.push(current);
            current = current.next;
        }
        while (!st.isEmpty()) {
            tmp.next = new ListNode(st.pop().val);
            tmp= tmp.next;
        }
        return res.next;
    }
}
