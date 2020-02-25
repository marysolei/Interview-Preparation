//Question link: https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if ( n ==0 )return false ;
        if (n == 1) return true;
        long num = (long) n ;
        return (num&(num-1)) == 0;
    }
}
