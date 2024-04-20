class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> farmlandList = new ArrayList<>();

        int rowCount = land.length;
        int colCount = land[0].length;

        for (int row = 0; row < rowCount; ++row) {
            for (int col = 0; col < colCount; ++col) {

                if (land[row][col] == 0 || (col > 0 && land[row][col - 1] == 1)
                        || (row > 0 && land[row - 1][col] == 1)) {
                    continue;
                }

                int bottomRow = row;
                int rightCol = col;

                while (bottomRow + 1 < rowCount && land[bottomRow + 1][col] == 1) {
                    ++bottomRow;
                }

                while (rightCol + 1 < colCount && land[bottomRow][rightCol + 1] == 1) {
                    ++rightCol;
                }
                farmlandList.add(new int[] { row, col, bottomRow, rightCol });
            }
        }

        return farmlandList.toArray(new int[farmlandList.size()][4]);
    }
}