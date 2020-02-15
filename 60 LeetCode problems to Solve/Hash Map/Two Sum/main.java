//Question Link: https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        if (nums.length == 0 ) return res;
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i=0; i< nums.length; i++){
            hmap.put(target- nums[i] , i);

        }
        for (int j =0; j< nums.length ; j++) {
            if (hmap.containsKey(nums[j]) && hmap.get(nums[j]) != j) {
                res[0]= hmap.get(nums[j]);
                res[1]= j;
            }
        }
        return res;
    }
}
