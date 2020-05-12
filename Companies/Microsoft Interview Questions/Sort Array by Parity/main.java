//Question URL: https://leetcode.com/problems/sort-array-by-parity/

class Solution {
    public int[] sortArrayByParity(int[] A) {

        if (A== null || A.length ==0)return A;
        int index =0;
        for (int i=0; i< A.length ; i++) {
            if (A[i] %2 == 0)  {
                int tmp = A[index];
                A[index] = A[i];
                A[i]= tmp;
                index++;
            }
        }
        return A;
    }
}

//Time Complexity: O(N) -> going throught the array elements
//Space Complexity: O(1) 
