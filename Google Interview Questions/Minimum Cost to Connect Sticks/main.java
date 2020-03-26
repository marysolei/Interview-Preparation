//Question Link: https://leetcode.com/problems/minimum-cost-to-connect-sticks/

class Solution {
    public int connectSticks(int[] sticks) {
        if (sticks == null || sticks.length == 0)return 0;
        if (sticks.length ==0 )return sticks[0];
        int res =0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int stick : sticks) {
            minHeap.add(stick);
        }
        while (minHeap.size()>1) {
            int sum = minHeap.poll()+ minHeap.poll();
            res+= sum;
            minHeap.add(sum);

        }
        return res;
    }
}

//Time Complexity: O(nlog(n)) -> reheaphify every single time that we remove an element, and we have n elements => nlog(n)
//Space Complexity: O(n) we have n elements
