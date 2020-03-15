//Question Link: https://leetcode.com/problems/valid-parentheses/

class Solution {
    //Time Complexity: O(n). we traverse through all characters in string
    //Space Complexity: O(n)
    public boolean isValid(String s) {
        if (s.length() ==0 ) return true;
         if (s.length() ==1 ) return false;
        Stack <Character> tmpStack = new Stack<>();
        HashMap<Character, Character> hmap = new HashMap<>();
         hmap.put('(',')');
         hmap.put('[',']');
         hmap.put('{','}');
        for (int i=0; i< s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c== '[' || c== '('){
            tmpStack.push(hmap.get(c));
            } else if (c == '}' || c== ']' || c== ')'){
                if (!tmpStack.isEmpty() && tmpStack.peek() ==c ) {

                       tmpStack.pop();
                }else {
                       return false;
                   }
                }
            }

        return tmpStack.size()==0;
    }
}
