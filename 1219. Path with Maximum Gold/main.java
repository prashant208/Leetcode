class Solution {
    private int[][] grid;
    private int rows;
    private int cols;

    public int getMaximumGold(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        this.grid = grid;
        int maxGold = 0;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                maxGold = Math.max(maxGold, dfs(i, j));
            }
        }
        return maxGold;
    }

    private int dfs(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == 0) {
            return 0;
        }
        int gold = grid[row][col];
        grid[row][col] = 0;
        int[] directions = { -1, 0, 1, 0, -1 };
        int maxGold = 0;
        for (int k = 0; k < 4; ++k) {
            maxGold = Math.max(maxGold, gold + dfs(row + directions[k], col + directions[k + 1]));
        }
        grid[row][col] = gold;
        return maxGold;
    }
}