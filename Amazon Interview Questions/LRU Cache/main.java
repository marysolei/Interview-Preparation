//Question Link: https://leetcode.com/problems/lru-cache/


class LRUCache {
    HashMap<Integer, Node> hmap ;
    int capacity;
    Node start = new Node(0,0);
    Node end = new Node(0,0);

    public LRUCache(int capacity) {
        hmap = new HashMap<>();
        this.capacity= capacity;
        start.next = end;
        end.prev= start;
    }
    public void removeBottom (Node n ) {
        n.prev.next= n.next;
        n.next.prev= n.prev;
    }
    public void addTop (Node n ) {
        n.prev = start;
        n.next= start.next;
        n.next.prev = n;
        start.next = n;
    }

    public int get(int key) {
        if (hmap.containsKey(key)) {
            Node n = hmap.get(key);
            int res = n.value;
            removeBottom(n);
            addTop(n);
            return res;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (hmap.containsKey(key)) {
            Node n = hmap.get(key);
            n.value = value;
            removeBottom(n);
            addTop(n);
        } else {
            Node n = new Node(key,value);
            hmap.put(key,n);
            addTop(n);
            if(hmap.size() >capacity) {
                hmap.remove(end.prev.key);
                removeBottom(end.prev);
            }
        }
    }
}
public class Node{
    int key;
    int value;
    Node prev;
    Node next;
    public Node(int k , int v) {
        this.key=k ;
        this.value = v;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
