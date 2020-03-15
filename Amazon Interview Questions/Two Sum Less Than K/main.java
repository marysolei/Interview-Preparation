//Question Link: https://leetcode.com/problems/two-sum-less-than-k/

class Solution {
    public int twoSumLessThanK(int[] A, int K) {
       Arrays.sort(A);
        int leftPointer = 0;
        int rightPointer = A.length -1;
        int maxSum = Integer.MIN_VALUE;
        while(leftPointer < rightPointer) {
            int currSum = A[leftPointer] + A[rightPointer];
            if (currSum < K && currSum >maxSum) {
                maxSum = currSum;
            } else if (currSum >= K) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
       return maxSum==Integer.MIN_VALUE?-1: maxSum ;
    }
}
