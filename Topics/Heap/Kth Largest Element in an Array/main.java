//Question Link: https://leetcode.com/problems/kth-largest-element-in-an-array/

class Solution {
    public int findKthLargest(int[] nums, int k) {

        if (nums.length==0)return 0;

        PriorityQueue <Integer> pq = new PriorityQueue<Integer>();

        for (int num:nums){
            pq.add(num);
            if (pq.size()>k) {
                pq.remove();
            }
        }
        return pq.peek();
    }
}
