//Question Link: https://leetcode.com/problems/reverse-string/

class Solution {
    public void reverseString(char[] s) {

        int left =0 ;
        int right = s.length -1;
        while (left<right) {
            char tmp = s[left];
            s[left] =s[right];
            s[right]= tmp;
            left++;
            right--;
        }

    }
}
//Time Complexity O(N) -> N is the elements in the array
//Space Complexity O(1)
