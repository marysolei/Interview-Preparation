
//Question Link:https://leetcode.com/problems/subarray-sum-equals-k/

class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0) return 0;
        int cnt=0 ;
        int sum =0 ;
        HashMap <Integer, Integer> hmap = new HashMap<>();
        hmap.put(0,1);
        for (int i =0 ; i< nums.length; i++) {
            sum += nums[i];
            if (hmap.containsKey(sum-k)){
                cnt += hmap.get(sum-k);
            }
            hmap.put(sum, hmap.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}
