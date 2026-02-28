class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int prev[] = new int[m + 1];
        int curr[] = new int[m + 1];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    curr[j] = prev[j - 1] + 1;
                } else {
                    curr[j] = Math.max(prev[j], curr[j - 1]);
                }
            }

            prev = curr.clone(); // move current row to previous
        }

        return prev[m];
    }
}
















// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         int n=text1.length();
//         int m=text2.length();
//         int dp[][]=new int[n+1][m+1];
//         for(int i=1;i<n+1;i++){
//             for(int j=1;j<m+1;j++){
//                 if(text1.charAt(i-1)==text2.charAt(j-1)){
//                     dp[i][j]=dp[i-1][j-1]+1;//same adding 1 for same maeans length
//                 }else{
//                     dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);//diff
//                 }
//             }
//         }
//         return dp[n][m];
        
//     }
// }