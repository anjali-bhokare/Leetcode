class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        class DFS {
            void run(int r, int c, boolean[][] visited, int prevHeight) {
                if (r < 0 || c < 0 || r >= m || c >= n) return;
                if (visited[r][c]) return;
                if (heights[r][c] < prevHeight) return;

                visited[r][c] = true;

                for (int[] dir : directions) {
                    run(r + dir[0], c + dir[1], visited, heights[r][c]);
                }
            }
        }

        DFS dfs = new DFS();
        for (int i = 0; i < m; i++) {
            dfs.run(i, 0, pacific, heights[i][0]);
            dfs.run(i, n - 1, atlantic, heights[i][n - 1]); 
        }
        for (int j = 0; j < n; j++) {
            dfs.run(0, j, pacific, heights[0][j]); 
            dfs.run(m - 1, j, atlantic, heights[m - 1][j]); 
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }
}
