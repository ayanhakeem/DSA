class Solution {
    private static void path(char grid[][],int m,int n,int i,int j){
        while(j<n){
            grid[i][j]='.';
            j++;    
        }
        j=n-1;
        while(i<m){
            grid[i][j]='.';
            i++;
        }
    }
    public String[] createGrid(int m, int n) {
        char grid[][]=new char[m][n];
          for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '#';
            }
        }
        path(grid,m,n,0,0);
        String[] result = new String[m];

        for (int i = 0; i < m; i++) {
            result[i] = new String(grid[i]);
        }

        return result;
    }
}