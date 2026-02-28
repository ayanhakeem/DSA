class Solution {
     public int lcs(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;//same adding 1 for same maeans length
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);//diff
                }
            }
        }
        return dp[n][m];
        
    }

    public int longestPalindromeSubseq(String s) {
        String t = new StringBuilder(s).reverse().toString();
        return lcs(s,t);
        
    }
}
