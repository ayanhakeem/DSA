class Solution {
    public void dfs(int row,int col,int[][] image,int ans[][],int incol,int color,int delrow[],int delcol[]){
        ans[row][col]=color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && ans[nrow][ncol]!=color && image[nrow][ncol]==incol){
                dfs(nrow,ncol,image,ans,incol,color,delrow,delcol);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int incol=image[sr][sc];
        int ans[][]=image;
        int delrow[]={-1,0,+1,0};
        int delcol[]={0,+1,0,-1};
        dfs(sr,sc,image,ans,incol,color,delrow,delcol);
        return ans;

        
    }
}