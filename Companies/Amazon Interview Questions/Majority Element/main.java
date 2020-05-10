//Question URL: https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {

        if (nums.length == 1)return nums[0];

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int num : nums) {
            if (hmap.containsKey(num) && hmap.get(num)+1 > nums.length/2){
                return num;
            }else {
                hmap.put(num, hmap.getOrDefault(num,0)+1);
            }
        }
        return -1;
    }
}

//Time Complexity: O(N) -> number of elements in the array
//Space Complexity: O(N) 
