//Question URL:https://leetcode.com/problems/top-k-frequent-elements/

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer> result = new ArrayList<>();
        if (nums== null || nums.length ==0 || k==0)return result;

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> (freq.get(b) - freq.get(a)));

        for (int key: freq.keySet()) {
            maxHeap.add(key);
        }
        for (int i=0; i< k;i ++){
            result.add(maxHeap.poll());
        }
        return result;
    }
}

//Time Complexity: O(Nlogk) using and sorting by maxHeap
//Space Complexity: O(N) to store the HashMap
