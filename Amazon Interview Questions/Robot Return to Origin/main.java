//Question Link: https://leetcode.com/problems/robot-return-to-origin/

class Solution {
    public boolean judgeCircle(String moves) {

        if (moves== null || moves.length() ==0)return true;

        int col =0 ;
        int row =0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') col++;
            else if (c == 'D') col--;
            else if (c=='R')  row++;
           else row--;

        }
        return (col ==0) &&(row ==0);
    }
}
