//Question: https://leetcode.com/problems/word-search-ii/

class Solution {
    public List<String> findWords(char[][] board, String[] words) {

        List<String> result = new ArrayList<>();
        if (board == null || board.length ==0)return result;
        int rows = board.length;
        int cols = board[0].length;
        for (String word : words){
            boolean found = false;
            for (int row =0; row< rows; row++) {
                for (int col =0; col < cols; col++) {
                    if ( helper(board,word, row, col, 0)){
                        found = true;
                        break;
                    }
                }
                if (found ) {
                    result.add(word);
                    break;
                }
            }
        }
        return result;
    }
    int[][] dirs = new int[][]{{-1,0}, {0,1},{1,0}, {0,-1}};
    public boolean helper( char[][]board, String word, int row, int col, int index) {

        if (index == word.length ()) {
            return true ;
        }
        if (row <0 || row>= board.length || col < 0 || col>= board[row].length || board[row][col] != word.charAt(index) )return false;
        char tmp = board[row][col];
        board[row][col] = '-';
        for (int[]dir : dirs) {
            if (helper(board, word, row+dir[0], col+dir[1], index+1)){
                board[row][col] = tmp;
                return true;
            }
        }


        board[row][col]= tmp;
        return false;
    }
}
