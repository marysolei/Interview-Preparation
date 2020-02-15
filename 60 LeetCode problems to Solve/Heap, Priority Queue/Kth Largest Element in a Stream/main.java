//Question Link: https://leetcode.com/problems/kth-largest-element-in-a-stream/

class KthLargest {
 PriorityQueue <Integer> pq ;
    int k;
    public KthLargest(int k, int[] nums) {

        this.pq = new PriorityQueue<Integer> ();
        this.k = k;
        for( int num:nums){
            add(num);
        }
    }

    public int add(int val) {
        pq.add(val);

        if (pq.size()>k){
            pq.remove();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
