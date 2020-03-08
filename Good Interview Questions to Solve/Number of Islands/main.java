//Question Link: https://leetcode.com/problems/number-of-islands/

class Solution {
    public int numIslands(char[][] grid) {
        if ( grid == null || grid.length == 0) return 0;
        int row = grid.length ;
        int col = grid[0].length ;
        int cnt =0 ;
        for ( int r=0; r< row ; r++) {
            for (int c = 0 ;c <col ; c++) {
                if (grid[r][c] == '1') {
                  cnt+=  dfs(grid, r, c);
                }
            }
        }
        return cnt ;
    }
    public int dfs (char[][] grid, int row , int col ){
        if (row <0 || col < 0 || row>= grid.length || col >= grid[row].length || grid[row][col] == '0')return 0 ;

        grid[row][col] = '0';
        dfs(grid, row+1, col);
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);

        return 1;
    }
}

//Time Complexity: O(M*N)-> where M is the number of rows and N is number of Columns
//Space Complexity: O(M*N)-> stack calls worst case when there is all lands
