//Question URL: https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        if (height.length <= 1 )return 0;
        int i =0 ;
        int j = height.length -1;
        int maxArea= Integer.MIN_VALUE;
        while (i<j ) {
            int hMin= Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, hMin*(j-i));
            if (height[i] <height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
//Time Complexity: O(n) -> One time pass
//Space Complexity: O(1) -> constant space
