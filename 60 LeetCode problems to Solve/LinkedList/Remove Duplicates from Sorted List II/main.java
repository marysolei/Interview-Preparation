/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

 //Question Link:https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/


class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null)return null;
        ListNode tmp = new ListNode(0);
        ListNode slow = tmp;
        ListNode fast = head ;
        slow.next= fast;
        while (fast != null  ) {
            while (fast.next != null &&fast.val == fast.next.val) {
                fast = fast.next;
            }
            if (slow.next != fast){
                slow.next = fast.next;
                fast= slow.next;
            } else {
                slow = slow.next;
                fast= fast.next;
            }
        }
        return tmp.next;
    }
}
