//Question URL:https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/

class Solution {
    public int minDominoRotations(int[] A, int[] B) {

        int minSwap = Math.min(
            numSwaps(A[0], A, B),
            numSwaps(B[0], A, B)
        );
        minSwap = Math.min(minSwap,numSwaps(A[0], B,A));
        minSwap = Math.min(minSwap, numSwaps(B[0],B,A));
        return minSwap==Integer.MAX_VALUE? -1:minSwap;
    }
    public int numSwaps(int target, int[]A, int[]B) {

        int cnt =0;
        for (int i=0; i< A.length; i++){
            if (A[i] != target && B[i] != target) {
                return Integer.MAX_VALUE;
            }else if (A[i]!= target){
                cnt++;
            }
        }
        return cnt;
    }
}

//Time Complexity: O(N) -> where N is the number of dominos
//Space Complexity: O(1) -> constant 
