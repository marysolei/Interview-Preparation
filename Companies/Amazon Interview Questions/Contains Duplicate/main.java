//Question Link: https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {

        if (nums == null || nums.length == 0)return false;
         Set<Integer> count= new HashSet<>();
        for (int num : nums) {
            if (count.contains(num)) return true;
            count.add(num);
        }
        return false;
    }
}
//Time Complexity: O(N) -> where N is the number of element in the array
//Space Complexity: O(N)
