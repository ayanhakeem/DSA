class Solution {
    class Tuple{
        int d;
        int row;
        int col;

        public Tuple(int d,int row,int col){
            this.d=d;
            this.row=row;
            this.col=col;   
        }
    }
    public int minimumEffortPath(int[][] heights) {
        //we use dijiktras algo
        PriorityQueue<Tuple>pq=new PriorityQueue<Tuple>((x,y)->x.d-y.d);
        int n=heights.length;
        int m=heights[0].length;
        int dist[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=(int)1e9;
            }
        }
        dist[0][0]=0;
        pq.add(new Tuple(0,0,0));
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while(!pq.isEmpty()){
            Tuple curr=pq.poll();
            int diff=curr.d;
            int r=curr.row;
            int c=curr.col;

            if(r==n-1 && c==m-1) return diff;

            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m  ){
                    int neweffort=Math.max(Math.abs(heights[r][c]-heights[nr][nc]),diff);
                    if(neweffort<dist[nr][nc]){
                        dist[nr][nc]=neweffort;
                        pq.add(new Tuple(neweffort,nr,nc));
                    }
                }
            }
        }
        return 0;
        
    }
}