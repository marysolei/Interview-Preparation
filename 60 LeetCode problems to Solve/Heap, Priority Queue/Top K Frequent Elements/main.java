//Question Link:https://leetcode.com/problems/top-k-frequent-elements/

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
         if ( nums == null || nums.length==0 || k==0){
            return null;
        }
         HashMap <Integer, Integer> hmap = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((n1, n2) -> hmap.get(n1) - hmap.get(n2));
        List<Integer> res = new ArrayList<>();

        for (int num : nums) {
            hmap.put(num, hmap.getOrDefault(num,0)+1);
        }

        for (int n:hmap.keySet()) {
            pq.add(n);
            if (pq.size() >k) {
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            res.add(pq.poll());
            Collections.reverse(res);
        }
    return res;
    }
}
