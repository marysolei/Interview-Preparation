//Question: https://leetcode.com/problems/number-of-distinct-islands/

class Solution {

    List<Integer> path;
    public int numDistinctIslands(int[][] grid) {

        if (grid == null || grid.length ==0)return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        HashSet<List<Integer>> pathes = new HashSet<>();
        for (int row =0; row< rows; row++) {
            for (int col=0; col< cols; col++) {
                if (grid[row][col]==1 ){
                    path = new ArrayList<>();
                    helper(grid, row,col, 0);
                    if (!path.isEmpty()) {
                        pathes.add(path);
                    }
                }
            }
        }
        return pathes.size();
    }
    public void helper(int[][] grid,  int row, int col, int index ){
        if (row <0 || row>= grid.length ||col< 0 || col>= grid[row].length || grid[row][col]== 0)return;
            grid[row][col]=0;
        path.add(index);
        helper(grid, row+1, col, 1);
        helper(grid, row-1, col, 2);
        helper(grid, row, col+1, 3);
        helper(grid, row, col-1, 4);
        // track the exit state of the path. otherwise, a different shape can have the same path
        path.add(0);
    }
}

//Time Complexity: O(R∗C), where R is the number of rows in the given grid, and C is the number of columns.
//Space complexity: stack call for dfs function
