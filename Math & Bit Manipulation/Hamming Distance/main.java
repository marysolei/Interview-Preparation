//Question Link: https://leetcode.com/problems/hamming-distance/

class Solution {
    public int hammingDistance(int x, int y) {

        int num =x^y;
        int dist=0;
        while(num>0) {
            if (num%2==1){
                dist+=1;
            }
            num/=2;
        }
        return dist;
    }
}
//Time Complexity:  O(1), since the Integer is of fixed size, the algorithm takes a constant time. For an Integer of 32 bit, the algorithm would take at most 32 iterations.
//Space Complexity: O(1), a constant size of memory is used, regardless the input.
