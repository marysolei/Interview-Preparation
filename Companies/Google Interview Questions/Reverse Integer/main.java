//Question Link: https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int x) {

        int num = x>0? x:-1*x;
        long res =0;
        int rem =0;
        while (num>0) {
            rem = num%10;
            res = res*10+rem;
            num/=10;
        }
         if (res>Integer.MAX_VALUE ) return 0;
        return x>0? (int)res :(int) (-1*res);
    }

}

//Time Complexity: O(log(x)).
//Space Complexity: O(1).
