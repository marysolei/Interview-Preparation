//Question Link: https://leetcode.com/problems/kth-largest-element-in-an-array/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0)return -1;

        PriorityQueue <Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() >k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}

//Time Complexity: O(nlogk) -> n is the number of elements in array
//Space Complexity: O(k) stroing k elements in heap
