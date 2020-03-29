//Question Link: https://leetcode.com/problems/flood-fill/

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if (image == null || image.length == 0)return image;
        if (image[sr][sc] == newColor) return image;
        int oldColor = image[sr][sc];

        if (image[sr][sc] != newColor){
            helper(image, sr, sc, oldColor, newColor);
        }

        return image;
    }
    public void helper(int[][]image, int row, int col, int oldColor, int newColor) {
        if (row<0 || col <0 || row>=image.length || col>=image[row].length || image[row][col] != oldColor) return;

        image[row][col]= newColor;
        helper(image, row+1, col, oldColor, newColor);
        helper(image, row-1, col, oldColor, newColor);
        helper(image, row, col+1, oldColor, newColor);
        helper(image, row, col-1, oldColor, newColor);
    }
}

//Time Complexity: O(n) -> n is the number of pixels in image
//Space Complexity: O(n) -> call stacks when calling dfs
