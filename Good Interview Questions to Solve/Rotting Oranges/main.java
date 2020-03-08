//Question Link: https://leetcode.com/problems/rotting-oranges/

class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0 )return 0;


        int res =0 ;
        int[][]dirs = new int[][]{{0,1},{-1,0},{0,-1},{1,0}};
         Queue<Point> rottenOranges = new ArrayDeque<>();
        int row = grid.length ;
        int col = grid[0].length;
        for (int r=0; r< row; r++) {
            for (int c=0; c<col; c++) {
                if (grid[r][c] == 2) {
                    rottenOranges.add(new Point(r,c,0));
                }
            }
        }
        while (!rottenOranges.isEmpty()) {
            Point current = rottenOranges.poll();
            res = Math.max(res, current.layer) ;
            for (int[] dir : dirs) {
                int newrow = current.row +dir[0];
                int newcol = current.col +dir[1];
                if (newrow>=0 && newcol >=0 && newrow <grid.length && newcol <grid[newrow].length && grid[newrow][newcol] ==1) {
                    rottenOranges.add(new Point(newrow, newcol, current.layer+1));
                    grid[newrow][newcol] = 2;

                }
            }
        }
        for (int r=0; r<row; r++) {
            for (int c=0; c<col ; c++) {
                if (grid[r][c]==1){
                    return -1;
                }
            }
        }
        return res;
    }
    public class Point{
        int row;
        int col ;
        int layer;
        public Point(int r, int c, int l) {
            this.row = r;
            this.col = c;
            this.layer = l;
        }
    }
}

//Time Complexity: O(n) -> n number of cells in grid
//Space Complexity: O(n) 
