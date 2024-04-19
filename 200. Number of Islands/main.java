class Solution {
    private char[][] grid;
    private int numRows;
    private int numCols;
    public int numIslands(char[][] grid) {
        numRows = grid.length;
        numCols = grid[0].length;
        this.grid = grid;
      
        int numIslands = 0;
        for (int i = 0; i < numRows; ++i){
            for (int j = 0; j < numCols; ++j){
                if (grid[i][j] == '1'){
                    depthFirstSearch(i, j);
                    ++numIslands;
                }
            }
        }
        return numIslands;
    }

    private void depthFirstSearch(int row, int col) {
        grid[row][col] = '0';
      
        int[] directions = {-1, 0, 1, 0, -1};
      
        for (int k = 0; k < 4; ++k) {
            int newRow = row + directions[k];
            int newCol = col + directions[k + 1];
            if (newRow >= 0 && newRow < numRows && newCol >= 0 && newCol < numCols && grid[newRow][newCol] == '1') {
                depthFirstSearch(newRow, newCol);
            }
        }
    }
}