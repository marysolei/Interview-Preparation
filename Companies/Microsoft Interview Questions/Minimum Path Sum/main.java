//https://leetcode.com/problems/minimum-path-sum/

class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length ==0) return 0;

        int row = grid.length ;
        int col = grid[0].length;
        int[][]memo = new int[row][col];
        memo[0][0]=grid[0][0];
        for (int i=1;i<row ; i++){
            memo[i][0] = memo[i-1][0]+grid[i][0];
        }
        for (int i=1; i< col; i++) {
            memo[0][i] = memo[0][i-1]+grid[0][i];
        }
        for (int r=1; r<row; r++) {
            for (int c=1; c<col; c++){
                memo[r][c] = grid[r][c] + Math.min(memo[r-1][c], memo[r][c-1]);
            }
        }
        return memo[row-1][col-1];
    }
}
