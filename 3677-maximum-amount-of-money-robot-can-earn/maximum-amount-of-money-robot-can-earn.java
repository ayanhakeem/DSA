class Solution {
    int m, n;
    int[][][] dp;

    public int solve(int[][] coins, int i, int j, int k) {
        // Out of bounds
        if (i >= m || j >= n) return Integer.MIN_VALUE;

        // Destination
        if (i == m - 1 && j == n - 1) {
            if (coins[i][j] < 0 && k > 0) return 0;
            return coins[i][j];
        }

        if (dp[i][j][k] != Integer.MIN_VALUE) {
            return dp[i][j][k];
        }

        int val = coins[i][j];
        int best;

        if (val >= 0) {
            best = val + Math.max(
                solve(coins, i + 1, j, k),
                solve(coins, i, j + 1, k)
            );
        } else {
            // Option 1: take loss
            int takeLoss = val + Math.max(
                solve(coins, i + 1, j, k),
                solve(coins, i, j + 1, k)
            );

            // Option 2: neutralize (if possible)
            int neutralize = Integer.MIN_VALUE;
            if (k > 0) {
                neutralize = Math.max(
                    solve(coins, i + 1, j, k - 1),
                    solve(coins, i, j + 1, k - 1)
                );
            }

            best = Math.max(takeLoss, neutralize);
        }

        return dp[i][j][k] = best;
    }

    public int maximumAmount(int[][] coins) {
        m = coins.length;
        n = coins[0].length;

        dp = new int[m][n][3];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) {
                    dp[i][j][k] = Integer.MIN_VALUE;
                }
            }
        }

        return solve(coins, 0, 0, 2);
    }
}