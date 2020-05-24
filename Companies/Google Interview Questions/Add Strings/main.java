//Question URL: https://leetcode.com/problems/add-strings/

class Solution {

    public String addStrings(String num1, String num2) {

         if ( num1 == null || num1.length() ==0) return num2;
         if ( num2 == null || num2.length() ==0) return num1;

        int carry =0 ;
        StringBuilder result = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;

        while(i>=0 || j>= 0){
            int sum = carry;
            if (i>=0 ){
                sum+= num1.charAt(i)-'0';
                i--;
            }
            if (j>=0 ){
                sum += num2.charAt(j)-'0';
                j--;
            }
            carry= sum/10;
            result.append(sum%10);
        }
        if (carry>0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}


//Time Complexity: O(M+N) (M length of num1 / N length of num2)
//Space Complexity: O(Max(M,N)) <--- for string builder
