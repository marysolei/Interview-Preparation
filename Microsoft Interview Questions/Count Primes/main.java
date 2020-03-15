//Question Link: https://leetcode.com/problems/count-primes/

class Solution {
    public int countPrimes(int n) {
        if (n <=1 )return 0 ;

        int primeCnt = 0 ;
        boolean[] primes= new boolean[n] ;
        for (int i =2; i< primes.length; i++) {
            primes[i] = true;
        }
        for (int i=2; i*i < n ; i++) {
            if (!primes[i])continue;
            for (int j = i*i ; j<n ; j+= i) {
                primes[j]= false;
            }
        }
        for (int i =0 ; i < primes.length ; i++) {
            if (primes[i]) primeCnt++;
        }
        return primeCnt;
    }
}
