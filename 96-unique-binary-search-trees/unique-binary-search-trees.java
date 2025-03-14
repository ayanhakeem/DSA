//tc=0(n*2)
//sc=0(n)
class Solution {
    public int numTrees(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            //i nodes required t form bst
            for(int j=0;j<i;j++){
                int left=dp[j];
                int right=dp[i-j-1];
                dp[i]+=left*right;
            }
        }
        return dp[n];//last
        
    }
}