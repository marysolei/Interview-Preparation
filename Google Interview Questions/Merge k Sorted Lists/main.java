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
    //Time Complexity: O(n*m log(n*m))
    //Space Complexity: O(n*m)
    //n== max # of lists , m== max#of nodes in a list
    public ListNode mergeKLists(ListNode[] lists) {

        if ( lists == null || lists.length == 0)return null;
        ListNode result = new ListNode(-1);
        ListNode tmp = result;
        PriorityQueue <Integer> minHeap = new PriorityQueue<>();
        for (ListNode list : lists) {
            while (list != null) {
                minHeap.add(list.val);
                list = list.next;
            }
        }
        while(!minHeap.isEmpty()){
            tmp.next = new ListNode(minHeap.poll());
            tmp = tmp.next ;
        }
        return result.next;
    }
}
