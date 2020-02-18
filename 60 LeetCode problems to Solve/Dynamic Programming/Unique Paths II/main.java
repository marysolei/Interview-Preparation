//Question Link: https://leetcode.com/problems/unique-paths-ii/

class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        if (grid == null || grid[0].length == 0)return 0;
        if (grid [0][0]==1)return 0;

        int row =grid.length;
        int col = grid[0].length;
        int[][]memo= new int[row][col];
        memo[0][0] = 1;

        for (int i =1; i<row; i++) {
            if (grid[i][0] !=1) memo[i][0]=memo[i-1][0];
        }
        for (int i =1; i<col; i++) {
            if (grid[0][i] !=1) memo[0][i]=memo[0][i-1];
        }

        for (int r =1; r<row; r++) {
            for (int c=1; c<col; c++) {
                if (grid[r][c]!=1){
                    memo[r][c] = memo[r-1][c]+memo[r][c-1];
                }
            }
        }
        return memo[row-1][col-1];
    }
}
