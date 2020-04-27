//Question Link: https://leetcode.com/problems/intersection-of-two-linked-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public class Result {
        ListNode tail;
        int len;
        public Result (ListNode t, int l) {
            this.tail= t;
            this.len= l;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode longer;
        ListNode shorter;
        int diff =0;
        Result resA = getLenTail(headA);
        Result resB = getLenTail(headB);
        if (resA.tail != resB.tail) return null;

        if (resA.len > resB.len) {
            longer = headA;
            shorter= headB;
            diff = resA.len - resB.len;
        } else {
            longer = headB;
            shorter = headA;
            diff= resB.len - resA.len;
        }

        while (diff >0) {

            longer = longer.next;
            diff--;
        }
        while (shorter != longer) {
            shorter =shorter.next;
            longer = longer.next;
        }
        return shorter;
    }
    public Result getLenTail (ListNode root) {
       // ListNode tail ;
        int len =0;
        while (root != null) {
            root = root.next;
            len++;
        }
        return new Result (root, len);
    }
}
