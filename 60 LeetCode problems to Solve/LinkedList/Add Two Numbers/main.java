/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

 //Question Link: https://leetcode.com/problems/add-two-numbers/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 != null) return l2;
        if (l1!= null && l2 == null) return l1;
        ListNode res = new ListNode(0);
        int carry =0;
        ListNode current = res;
        while (l1 != null || l2 != null || carry >0) {
            int tmp = carry;
            if (l1 != null){
                tmp+= l1.val;
                l1= l1.next;
            }
            if (l2!= null) {
                tmp += l2.val;
                l2= l2.next;
            }
            carry = tmp/10;
            current.next= new ListNode(tmp%10);
            current = current.next;
        }
       return res.next;
    }
}
