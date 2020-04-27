//Question Link: https://leetcode.com/problems/add-binary/

class Solution {
    public String addBinary(String a, String b) {

        int i = a.length()-1;
        int j = b.length() -1;
        int carry=0;
        StringBuilder result = new StringBuilder();
        while(i>=0 || j >=0 ){
            int sum = carry;
            if (i>=0) {
                sum+= a.charAt(i) -'0';
                i--;
            }
            if (j>=0) {
                sum+= b.charAt(j)-'0';
                j--;
            }
            result.insert(0,sum%2);
            carry = sum/2;
        }
        if (carry>0) {
            result.insert(0, 1);
        }
        return result.toString();
    }
}


//Time complexity: O(max(N,M)), where N and M are lengths of the strings a and b.
//Space complexity: O(max(N,M)) to keep the answer.
