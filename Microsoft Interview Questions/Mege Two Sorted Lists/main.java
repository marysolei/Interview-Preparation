//Question Link: https://leetcode.com/problems/merge-two-sorted-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //Time Complexity: O(n) -> n is the length of smallest list
    //Space Complexity : O(1) -> only allocates some pointers
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null )return l2;
        if (l2 == null) return l1;
        ListNode result = new ListNode(-1);
        ListNode tmp = result;
        while(l1 != null && l2 != null) {
            if (l1.val < l2.val ) {
                tmp.next = l1;
                l1= l1.next;
            } else {
                tmp.next = l2;
                l2= l2.next;
            }
            tmp= tmp.next;
        }
        if (l1 != null) {
            tmp.next= l1;
        }
        if (l2 != null) {
            tmp.next = l2;
        }
        return result.next;
    }
}
