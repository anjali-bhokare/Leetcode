class Solution {
    public int solve(int[][] grid,int i, int j,int[][] arr) {
        int m = grid.length;
        int n = grid[0].length;
        if (i== m-1 && j== n-1){
            return grid[i][j];
        }
        if (arr[i][j] != -1){
            return arr[i][j];
        }
        if (i == m - 1){
            return arr[i][j] = grid[i][j] + solve(grid, i, j + 1,arr);
            }
        if (j == n - 1){
            return arr[i][j] = grid[i][j] + solve(grid,i + 1,j,arr);
        }

        return arr[i][j] = grid[i][j] +Math.min(solve(grid, i, j + 1,arr),
                         solve(grid, i + 1, j, arr));
    }

    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++)
            java.util.Arrays.fill(arr[i], -1);

        return solve(grid, 0, 0, arr);
    }
}