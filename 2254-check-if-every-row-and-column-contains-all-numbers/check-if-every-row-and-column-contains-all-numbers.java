class Solution {
    
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            boolean vis[]=new boolean[n+1];
            for(int j=0;j<m;j++){
                int val=matrix[i][j];
                if(val<1 || val>n || vis[val]) return false;
                vis[val]=true;
            }
        }

          // check each column
        for (int j = 0; j < n; j++) {
            boolean[] seen = new boolean[n + 1];
            for (int i = 0; i < n; i++) {
                int val = matrix[i][j];
                if (val < 1 || val > n || seen[val]) return false;
                seen[val] = true;
            }
        }
        
        return true; // all rows and cols are valid
    }
}