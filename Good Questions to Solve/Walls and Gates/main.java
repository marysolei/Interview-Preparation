//Question Link: https://leetcode.com/problems/walls-and-gates/

/*You are given a m x n 2D grid initialized with these three possible values.
-1 - A wall or an obstacle.
0 - A gate.
INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than 2147483647.
Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with INF.
*/
class Solution {
    public void wallsAndGates(int[][] rooms) {
        if (rooms == null || rooms.length == 0)return;
        int row = rooms.length ;
        int col = rooms[0].length ;
        for (int r=0; r<row; r++){
            for (int c=0; c<col; c++) {
                if (rooms[r][c] == 0) {
                    dfs(rooms, r ,c , 0);
                }
            }
        }
    }
    public void dfs(int[][]rooms, int row, int col, int dist) {
        if (row<0 || col<0 || row>= rooms.length || col >= rooms[row].length || rooms[row][col]<dist) return;
        rooms[row][col] =dist;
        dfs(rooms, row+1, col, dist+1);
        dfs(rooms, row-1, col, dist+1);
        dfs(rooms, row, col+1, dist+1);
        dfs(rooms, row, col-1, dist+1);
    }
}
