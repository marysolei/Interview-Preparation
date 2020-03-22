//Question Link: https://leetcode.com/problems/contains-duplicate-ii/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums== null || nums.length ==0)return false;

        Set<Integer> hset = new HashSet<>();
        for (int i=0; i< nums.length ; i++){
            if (hset.contains(nums[i])) return true;
            hset.add(nums[i]);
            if (hset.size() >k){
                hset.remove(nums[i-k]);
            }
        }
        return false;
    }
}
//Time complexity : O(n).
//Space Complexity: O(min(n,k)) 
