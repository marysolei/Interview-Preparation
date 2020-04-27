//Question Link: https://leetcode.com/problems/merge-k-sorted-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
     if (lists.length ==0)return null;
        ListNode res = new ListNode(0);
        ListNode tmp = res;
     PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (ListNode current : lists) {
            while (current != null) {
                pq.add(current.val);
                current = current.next;
            }
        }
        while (!pq.isEmpty()) {
            tmp.next = new ListNode(pq.poll());
            tmp= tmp.next;
        }
        return res.next;
    }
}
