class Solution {
    class Pair{
        int first;
        int second;

        public Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        Queue<Pair>q=new LinkedList<>();

        //travese boundary

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Check if current cell lies on boundary
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    // If boundary cell is land, mark visited and push to queue
                    if (grid[i][j] == 1 && vis[i][j]==0) {
                        vis[i][j] = 1;
                        q.add(new Pair(i,j));
                    }
                }
            }
        }
        
        int dr[]={-1, 0, 1, 0};
        int dc[]={0, 1, 0, -1};
        while(!q.isEmpty()){
            int r=q.peek().first;
            int c=q.peek().second;
            q.remove();
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1 && vis[nr][nc]==0){
                    q.add(new Pair(nr,nc));
                    vis[nr][nc]=1;
                }
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]==1){
                    cnt++;
                }
            }
        }
        return cnt;

    }
}