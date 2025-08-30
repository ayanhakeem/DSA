class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length;       // number of rows
        int m = dungeon[0].length;    // number of columns

        // dp[i][j] = min health needed to enter cell (i,j)
        int[][] dp = new int[n][m];

        // Base case: princess cell (bottom-right)
        dp[n-1][m-1] = Math.max(1, 1 - dungeon[n-1][m-1]);//las cell fill means the prince must have 1hp to surview beacuse if he reaches but his hp <0 means he dies

        // Fill last row (bottom row)
        for (int j = m - 2; j >= 0; j--) {//only right can move
            dp[n-1][j] = Math.max(1, dp[n-1][j+1] - dungeon[n-1][j]);
        }

        // Fill last column (rightmost column)
        for (int i = n - 2; i >= 0; i--) {//only down can move so i+1
            dp[i][m-1] = Math.max(1, dp[i+1][m-1] - dungeon[i][m-1]);
        }

        // Fill the rest of the DP table from (1,1) cell
        for (int i = n - 2; i >= 0; i--) {
            for (int j = m - 2; j >= 0; j--) {
                int minNextStep = Math.min(dp[i+1][j], dp[i][j+1]);//next step is min beacuse we have to find minmum steps to reach
                dp[i][j] = Math.max(1, minNextStep - dungeon[i][j]);
            }
        }

        return dp[0][0]; // Minimum initial health needed
    
    }
}
//tc=o(n*m)
//sc=o(n*m)