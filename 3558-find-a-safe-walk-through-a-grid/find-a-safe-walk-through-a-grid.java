class Solution {
    class Pair {
        int r;
        int c;
        int h;


        public Pair(int r, int c,int h) {
            this.r=r;
            this.c=c;
            this.h=h;
        }
    }

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n=grid.size();
        int m=grid.get(0).size();
        int best[][]=new int[n][m];
        for(int row[]:best){
            Arrays.fill(row,-1);
        }

        Queue<Pair>q=new LinkedList<>();
        int sh=health-grid.get(0).get(0);
        if(sh<=0) return false;
        q.offer(new Pair(0,0,sh));
        best[0][0]=sh;

        while(!q.isEmpty()){
            Pair curr=q.poll();
    

            if(curr.r==n-1 && curr.c==m-1)  return true;

            int dr[]={-1,0,1,0};
            int dc[]={0,1,0,-1};

            for(int k=0;k<4;k++){
                int nr=curr.r+dr[k];
                int nc=curr.c+dc[k];

                if(nr>=0 && nr<n && nc>=0 && nc<m ){
                    int nh=curr.h-grid.get(nr).get(nc);

                    if(nh>best[nr][nc] && nh>0){
                        best[nr][nc]=nh;
                        q.offer(new Pair(nr,nc,nh));
                    }

                }
            }
        }
        return false;    
    }
}