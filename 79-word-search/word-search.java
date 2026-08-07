class Solution {
    private static boolean dfs(int i,int j,char board[][],String word,int idx){
        int n=board.length;
       int m=board[0].length;
       if(idx==word.length()) return true;

       if(i<0 || j<0 || i>=n || j>=m || board[i][j]!=word.charAt(idx)) return false;
        //if 1st char of word==board[i][j] then store in temp and mark vis=true
       char temp=board[i][j];
       board[i][j]='#'; 

       boolean found=dfs(i+1,j,board,word,idx+1) || dfs(i-1,j,board,word,idx+1) || dfs(i,j+1,board,word,idx+1) || dfs(i,j-1,board,word,idx+1);

       //backtrack restore the char
       board[i][j]=temp;

       return found;
    }
    public boolean exist(char[][] board, String word) {
       int n=board.length;
       int m=board[0].length;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(dfs(i,j,board,word,0)){
                return true;
            }
        }
       } 
       return false;
    }
}