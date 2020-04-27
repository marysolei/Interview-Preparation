//Question Link: https://leetcode.com/problems/valid-mountain-array

class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3)return false;
        int i=0 ;
        int len = A.length;
        while (i<len-1 && A[i]<A[i+1])  i++ ;
        if (i==0 || i == len-1) return false;
        while (i<len-1 && A[i]>A[i+1]) i++;
        return i== len-1;
    }
}

//Time Complexity= O(N) where N is the length of array
//SpaceCompelexity = O(1)
