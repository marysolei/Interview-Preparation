//Question Link: https://leetcode.com/problems/backspace-string-compare/

class Solution {
    public boolean backspaceCompare(String S, String T) {

        Stack<Character> sStack = modifyString(S);
        Stack<Character> tStack = modifyString(T);
        while(!sStack.isEmpty()) {
            char c = sStack.pop();
            if (tStack.isEmpty() || c!= tStack.pop()) {
                return false;
            }
        }
        return sStack.isEmpty() && tStack.isEmpty();
    }

    public Stack<Character> modifyString(String S) {
        Stack<Character> sStack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c != '#') {
                sStack.push(c);
            } else if (c== '#' && !sStack.isEmpty()) {
                sStack.pop();
            }
        }
        return sStack;
    }
}
//Time Complexity: O(M+N), where M,N are the lengths of S and T.
//Space Complexity: O(M+N).
