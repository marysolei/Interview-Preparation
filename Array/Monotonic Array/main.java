//Question Link: https://leetcode.com/problems/monotonic-array/

class Solution {
    public boolean isMonotonic(int[] A) {

        boolean increasing = true ;
        boolean decreasing = true ;

        for (int i=1; i< A.length; i++) {
            if (A[i-1]>A[i]) increasing = false;
            if (A[i-1]<A[i]) decreasing = false;
        }
        return increasing || decreasing;
    }
}
//Time Complexity: O(N)
//Space Complexity: O(1)
