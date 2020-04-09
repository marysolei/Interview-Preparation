//Question Link: https://leetcode.com/problems/flip-game-ii/

class Solution {
    public boolean canWin(String s) {

        if (s== null || s.length()<2) return false;

        for (int i=0; i< s.length()-1; i++) {
            if (s.charAt(i) == '+' && s.charAt(i+1)=='+') {
                String newState = s.substring(0,i) + "--"+ s.substring(i+2);
                if (!canWin(newState)) {
                    return true;
                }
            }
        }
       return false;
    }
}
