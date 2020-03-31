//Question Link: https://leetcode.com/problems/task-scheduler/


class Solution {
    public int leastInterval(char[] tasks, int n) {

        if (tasks == null || tasks.length == 0)return 0;

        Map<Character, Integer> freq = new HashMap<>();
        for (char c: tasks) {
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        maxHeap.addAll(freq.values());
        int cycles = 0;
        while(!maxHeap.isEmpty()) {

            List<Integer> tmp = new ArrayList<>();
            for (int i=0; i< n+1; i++) {
                if (!maxHeap.isEmpty()){
                tmp.add(maxHeap.remove());
                }
            }

            for (int cnt :tmp){
                cnt--;
                if (cnt>0) {
                    maxHeap.add(cnt);
                }
            }
            cycles += maxHeap.isEmpty()? tmp.size():n+1;
        }
        return cycles;
    }
}

//Time complexity : O(n). Number of iterations will be equal to resultant time
//Space complexity : O(1). Priority queue and temp size will not exceed O(26).
