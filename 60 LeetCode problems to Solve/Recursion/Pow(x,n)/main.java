//Question Link: https://leetcode.com/problems/powx-n/

class Solution {
    public double myPow(double x, int n) {

        if (x==0 || x==1) return x;
        if(n==0) return 1;
         if (n<0) {

             return 1/(x*myPow(x, -(n+1)));
         }
        double half = myPow(x, n/2);
        if (n%2==0){
            return half*half;
        }
        return x* half*half;

    }
}
