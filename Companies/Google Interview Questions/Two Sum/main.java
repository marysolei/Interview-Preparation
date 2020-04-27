//Question Link: https://leetcode.com/problems/two-sum


class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1,-1};
        int[] res = new int[2];
        Map<Integer, Integer> hmap = new HashMap<>();

        for (int i =0; i< nums.length ; i++) {
            hmap.put(target-nums[i], i);
        }
        for (int i =0 ; i< nums.length ; i++) {
            if (hmap.containsKey(nums[i]) && i != hmap.get(nums[i])) {
                res[0] = i;
                res[1] = hmap.get(nums[i]);
            }
        }
        return res;
    }

//Time Complexity: O(n) -> we traverse the list
//Space Complexity: O(n)-> The extra space for HashMap
