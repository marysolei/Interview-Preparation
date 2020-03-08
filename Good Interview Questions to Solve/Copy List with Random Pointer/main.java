//Question Link: https://leetcode.com/problems/copy-list-with-random-pointer/

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node current = head;

        //first pass
        while (current != null ){
            Node newnode = new Node (current.val);
            newnode.next = current.next;
            current.next = newnode;
            current = newnode.next;
        }
        current= head;
        //second pass
        while(current != null) {
            if (current.random != null) {
            current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        //third pass
        //current = head;

        Node odd = head;
        Node even = head.next;
       Node res = head.next;

        while ( even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = null;
        return res;
    }
}
