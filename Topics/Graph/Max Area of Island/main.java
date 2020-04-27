//Question Link: https://leetcode.com/problems/max-area-of-island/

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0 )return 0;
        int maxArea= 0;
        int row = grid.length ;
        int col = grid[0].length;
        for (int r=0; r<row; r++ ){
            for (int c=0; c<col ; c++) {
                if (grid[r][c] ==1) {
                    int tmp = helper(grid, r, c);
                    maxArea =Math.max(maxArea,tmp) ;
                }
            }
        }
        return maxArea;
    }
    public int helper(int[][]grid, int r, int c) {
        if (r<0 || c<0 || r>= grid.length || c>= grid[r].length || grid[r][c] ==0) return 0;

        int cnt =1;
        grid[r][c] =0;
         cnt+= helper(grid, r+1, c);
         cnt+= helper(grid, r-1, c);
         cnt+= helper(grid, r, c-1);
         cnt+= helper(grid, r, c+1);
        return cnt;
    }
}
