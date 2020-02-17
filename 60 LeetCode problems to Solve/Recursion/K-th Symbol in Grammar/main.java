//Question Link:https://leetcode.com/problems/k-th-symbol-in-grammar/

class Solution {
    public int kthGrammar(int N, int K) {
        if (N==1) return 0;
        if (N==2) {
            return K==1?0:1;
        }
        int num =(int) Math.pow(2, N-1);
        int mid= num/2;
        if (K<=mid){
            return kthGrammar(N-1, K);
        } else {
            if (N%2==0) return kthGrammar(N-1, num-K+1)==1?0:1;
            else {
                return kthGrammar(N-1, num-K+1)==1?1:0;
            }
        }
    }
}
