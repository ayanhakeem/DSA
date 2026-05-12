class Solution {
    public static boolean dfs(int i,int j,int k,int n,int m,char board[][],String word,boolean vis[][]){
        
        if(k==word.length()) return true;//we have reached end of word matched 


        // boundary + visited + mismatch check
        if (i < 0 || i >= n || j < 0 || j >= m
                || vis[i][j]
                || board[i][j] != word.charAt(k)) {
            return false;
        }

        // mark visited
        vis[i][j] = true;

        // 4 directions
        int[][] directions = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };

        // explore neighbors
        for (int[] d : directions) {

            int nr = i + d[0];
            int nc = j + d[1];

            if (dfs(nr, nc, k + 1,n,m, board, word, vis)) {
                return true;
            }
        }

        // backtrack
        vis[i][j] = false;

        return false;
    

    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean vis[][]=new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (dfs(i, j, 0,n,m, board, word, vis)) {
                    return true;
                }
            }
        }

        return false;
    }
}