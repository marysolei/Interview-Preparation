//Question Link: https://leetcode.com/problems/reverse-only-letters/

class Solution {
    public String reverseOnlyLetters(String S) {

        if (S.length()<=1 )return S;
        Stack <Character> charStack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (Character.isLetter(c)) {
                charStack.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        for (char c : S.toCharArray()) {
            if(Character.isLetter(c)) {
                res.append(charStack.pop());
            } else{
            res.append(c);
            }
        }
        return res.toString();
    }
}

//Time Complexity: O(N) N is the length of S
//Space Complexity: O(N)
