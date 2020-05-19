//Question URL: https://leetcode.com/problems/partition-equal-subset-sum/

class Solution {
    public boolean canPartition(int[] nums) {

        int total =0;
        for (int num: nums) {
            total+=num;
        }
        if (total %2 != 0)return false;
        return helper(nums, 0, 0 , total,new HashMap<String, Boolean>());
    }

    public boolean helper(int[]nums, int index, int sum , int total, HashMap<String,Boolean> state) {

        String current = index+""+sum;
        if (state.containsKey(current)) return state.get(current);

        if (sum == total/2)return true;
        if (sum>total/2 || index>=nums.length) return false;

        //Considering two cases: 1 adding the current num to the sum OR not considering the current num for this sum
        boolean found =  helper(nums, index+1, sum + nums[index],total, state ) || helper(nums, index+1, sum, total,state);
        state.put(current, found);
        return found;
    }
}


//Time Complexity: O(N*M) where N is the number of elements in the array and M is the total.
//Space Complexity: O(N) due to stack calls
