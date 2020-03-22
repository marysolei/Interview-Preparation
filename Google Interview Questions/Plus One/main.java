//Question Link: https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {

        for (int i=digits.length-1 ; i>= 0; i--) {
            if (digits[i] <9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[]res = new int[digits.length+1];
        res[0]=1;
        return res;
    }
}
//Time complexity : O(N) where N is the number of elements in digits
//Space complexity :  O(1) when digits contains at least one not-nine digit, and O(N) otherwise.
