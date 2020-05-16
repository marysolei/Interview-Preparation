//Question URL: https://leetcode.com/problems/max-area-of-island/

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if ( grid == null || grid.length == 0 )return 0 ;
        int row = grid.length ;
        int col = grid[0].length ;
        int maxArea = 0 ;
        for (int r=0; r< row; r++) {
            for (int c= 0; c< col; c++) {
                if (grid[r][c] == 1) {
                   int areaSize =  helper(grid, r, c );
                    maxArea= Math.max(maxArea, areaSize);
                }
            }
        }
       return maxArea;
    }
    public int helper(int[][] grid, int row, int col) {
        if (row <0 || col <0 || row>= grid.length || col >= grid[row].length || grid[row][col] == 0 )return 0;

        int cnt=1 ;
        grid[row][col]=0;
        cnt+= helper(grid, row+1, col);
        cnt+= helper(grid, row-1, col);
        cnt+= helper(grid, row, col+1);
        cnt+= helper(grid, row, col-1);

        return cnt;
    }
}

//Time Complexity: O(R*C) -> we visit all elements once
//Space Complexity: O(R*C) -> call stack recursion 
