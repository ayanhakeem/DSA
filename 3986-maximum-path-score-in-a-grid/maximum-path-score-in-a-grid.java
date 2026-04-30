class Solution {
    int n,m;
    int dp[][][];

    public  int f(int[][] grid, int i, int j, int remaining_k) {
        
        //  out of bounds
        if (i >= n || j >= m) return Integer.MIN_VALUE;

        int currcellvalue = grid[i][j];

        int currcost = 0, currscore = 0;

        if (currcellvalue == 0) {
            currscore = 0;
            currcost = 0;
        } else if (currcellvalue == 1) {
            currscore = 1;
            currcost = 1;
        } else { 
            currscore = 2;   
            currcost = 1;
        }

        //  cannot go beyond that cost 
        if (currcost > remaining_k){
            dp[i][j][remaining_k] = Integer.MIN_VALUE;
            return dp[i][j][remaining_k];
        }

        // destination
        if (i == n - 1 && j == m - 1) {
            dp[i][j][remaining_k] = currscore;
            return currscore;
        }

         // memoization
        if (dp[i][j][remaining_k] !=-1 ) {
            return dp[i][j][remaining_k];
        }

        // reduce remaining cost how much we require further 
        int newK = remaining_k - currcost;

        int right = f(grid, i, j + 1, newK);
        int down = f(grid, i + 1, j, newK);

        int best = Math.max(right, down);//take max score of right and down bcoz we need max score

        // no valid path still best -inf
        if (best == Integer.MIN_VALUE) {
            dp[i][j][remaining_k] = Integer.MIN_VALUE;
        }else{
            dp[i][j][remaining_k] = currscore + best;
        }


        return dp[i][j][remaining_k];
    }

    public int maxPathScore(int[][] grid, int k) {
        this.n = grid.length;
        this.m = grid[0].length;
        dp=new int[n][m][k+1];

        // initialize with -1 (means uncomputed)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int c = 0; c <= k; c++) {
                    dp[i][j][c] = -1;
                }
            }
        }
        int ans = f(grid, 0, 0, k);
        return ans < 0 ? -1 : ans;
    }
}