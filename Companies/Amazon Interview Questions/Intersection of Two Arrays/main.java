//Question Link: https://leetcode.com/problems/intersection-of-two-arrays/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> hset1 = new HashSet<>();
        for (int num : nums1) hset1.add(num);

        HashSet<Integer> intersection = new HashSet<>();
        for (int num : nums2){
            if (hset1.contains(num)) {
                intersection.add(num);
            }
        }
         int[] result = new int[intersection.size()];
        int index=0;
        for (int num : intersection) {
            result[index] = num;
            index++;
        }
        return result;
    }
}
