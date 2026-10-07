class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board,word,i,j,0)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,String word,int i,int j,int index) {
        if (index == word.length())// word fpunding condition 
        {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) // word not found
        {
            return false;
        }
// char not  match(here we have to cheack the conditon opps to the original one)
        if (board[i][j] != word.charAt(index)) {
            return false;
        }
// visited element mark as# so that we will find easily how many elements are visited
        char temp = board[i][j];
        board[i][j] = '#';
//explore all the sides of the marked elements to find the exact words
        boolean found =
                dfs(board, word, i + 1, j, index + 1) ||
                dfs(board, word, i - 1, j, index + 1) ||
                dfs(board, word, i, j + 1, index + 1) ||
                dfs(board, word, i, j - 1, index + 1);
        // and finally backtrack
        board[i][j] = temp;
        return found;
    }
}