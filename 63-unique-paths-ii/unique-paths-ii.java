class Solution {
    int dp[][];
    public int f(int i, int j, int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        if (i >= n || j >= m) {
            return 0;
        }

        
        if (obstacleGrid[i][j] == 1) {
            return 0;
        }

        
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        // recursion
        int right = f(i, j + 1, obstacleGrid);
        int down = f(i + 1, j, obstacleGrid);

        dp[i][j]=right + down;
        return dp[i][j];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;//not computed yet 
            }
        }
        return f(0, 0, obstacleGrid);
    }
}