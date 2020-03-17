//Question Link: https://leetcode.com/problems/last-stone-weight/

class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones == null || stones.length == 0 )return 0;

        PriorityQueue <Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        for (int stone : stones) {
            maxHeap.add(stone) ;
        }
        while (maxHeap.size()>1) {
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            if (x!=y) {
                maxHeap.add(y-x);
            }
        }
        return maxHeap.isEmpty()? 0: maxHeap.poll();
    }
}

//Time Complexity: O(nlog(n)) -> every time we remove an element we need to
//reheapify (log(n)), we have n elements => nlog(n).
//Space Complexity: n elements in a heap => O(n).
