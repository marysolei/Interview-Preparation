//Question URL: https://leetcode.com/problems/word-search/

class Solution {
    public boolean exist(char[][] board, String word) {

        if (board == null || board.length == 0)return false;

        int row = board.length;
        int col = board[0].length;
        int index=0;
        for (int r=0; r< row; r++) {
            for (int c=0; c<col ; c++){
                if (board[r][c] == word.charAt(0)) {
                   if( helper(board, word, r, c, index) ){
                       return true;
                   }
                }
            }
        }
        return false;
    }
    public boolean helper(char[][]board, String word, int row, int col , int index ){

        if (index == word.length())return true;
        if (row<0 || col < 0 || row>= board.length || col >= board[row].length || board[row][col] != word.charAt(index)) return false;

        char tmp = board[row][col];
        board[row][col] = '-';
        boolean found = helper(board, word, row+1, col, index+1)||
                        helper(board, word, row-1, col, index+1)||
                        helper(board, word, row, col+1, index+1)||
                        helper(board, word, row, col-1, index+1);
        board[row][col ]= tmp;
        return found;

    }
}
