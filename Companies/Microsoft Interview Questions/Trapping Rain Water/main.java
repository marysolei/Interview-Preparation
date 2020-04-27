//Question URL: https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] height) {
        int left =0;
        int right = height.length -1;
        int leftMax = 0 ;
        int rightMax =0;
        int res =0;

        while (left<right) {

            if (height[left] >height[right]) {

                leftMax = height[right]>leftMax? height[right]:leftMax;
                res += Math.max(leftMax- height[right], 0);
                right--;

            } else {
               rightMax= height[left]>rightMax? height[left]:rightMax;
                res += Math.max(rightMax- height[left], 0);
                left++;
        }
        }
        return res;
    }
}



//Time complexity: O(n). Single iteration of O(n).
//Space complexity: O(1) extra space. Only constant space required for leftright, left_max and right_max.

/*https://leetcode.com/marys/
Algorithm

- Initialize left pointer to 0 and right pointer to size-1
- While left<right, do:
    If height[left] is smaller than height[right]
    If height[left]≥left_max, update left_max
    Else add left_max−height[left] to ans
    Add 1 to left.

    Else
    If height[right]≥right_max, update right_max
    Else add right_max−height[right] to ans
    Subtract 1 from right.
*/
