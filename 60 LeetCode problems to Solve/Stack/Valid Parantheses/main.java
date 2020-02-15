
//Question Link: https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        if (s.length()==0 )return true;

        HashMap <Character, Character> hmap = new HashMap<>();
        hmap.put('(',')');
        hmap.put('{', '}');
        hmap.put('[', ']');
        Stack<Character> st= new Stack<Character>();
        for (int i=0; i< s.length(); i++) {
            char c= s.charAt(i);
            if (c== '{' || c=='[' || c=='('){
                st.push(hmap.get(c));
            } else if (c== '}' || c==']' || c==')') {
                if (st.size()>0 && st.peek() ==c) {
                    st.pop();
                } else {
                    return false ;
                }
            }
        }
        return st.size()==0;
    }
}
