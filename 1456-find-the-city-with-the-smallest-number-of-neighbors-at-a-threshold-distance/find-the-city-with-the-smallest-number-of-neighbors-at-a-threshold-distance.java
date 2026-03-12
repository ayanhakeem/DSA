class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        
        int dist[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        //multi source so we neeed to assign from both side wt means i,j and j,i
        for (int[] edge : edges) {
            dist[edge[0]][edge[1]] = edge[2];  // Set the distance from city1 to city2
            dist[edge[1]][edge[0]] = edge[2];  // Set the distance from city2 to city1
        }

         for (int i = 0; i < n; i++) {
            dist[i][i] = 0;//diagonal
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][k]!=Integer.MAX_VALUE && dist[k][j]!=Integer.MAX_VALUE){
                        dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                    }
                }
            }
        }

        int maxcnt=n;
        int city=-1;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(dist[i][j]<=distanceThreshold){
                    cnt++;
                }
            } 
            if(cnt<=maxcnt){
                maxcnt=cnt;
                city=i;
            }  
        }
        return city;

    }
}

//tc=o(n^3)
//sc=o(n^2)