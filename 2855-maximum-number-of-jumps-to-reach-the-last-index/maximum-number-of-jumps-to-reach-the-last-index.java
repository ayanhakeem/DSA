class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n=nums.length;
        int dp[]=new int[n];//dp[i] means max jumps neede to reach i from 0 idx
        Arrays.fill(dp,-1);
        dp[0]=0;//no jumps for 0 to 0
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(dp[i]!=-1){
                    int diff=Math.abs(nums[j]-nums[i]);
                    if(diff<=target){
                        dp[j]=Math.max(dp[j],dp[i]+1);
                    }   
                }
            
            }
        }
        return dp[n-1];
    }
}