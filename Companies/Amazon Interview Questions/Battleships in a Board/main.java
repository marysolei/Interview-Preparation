//Question URL: https://leetcode.com/problems/battleships-in-a-board/

class Solution {
    public int countBattleships(char[][] board) {

        if (board == null || board.length==0)return 0;
        int row = board.length;
        int col = board[0].length;
        int cnt=0;
        for (int r=0; r<row; r++) {
            for (int c=0; c<col; c++) {
                if (board[r][c] =='X') {
                    helper(board, r,c);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void helper(char[][]board, int row, int col) {
        if (row<0 || col<0 || row>=board.length || col>=board[row].length || board[row][col] =='.') return;

        board[row][col] ='.';
        helper(board, row+1, col);
        helper(board, row-1, col);
        helper(board, row, col+1);
        helper(board, row, col-1);
    }
}
