class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
        dp[n - 1] = true; // The last index is always reachable
        
        for (int i = n - 2; i >= 0; i--) {
            int maxJump = Math.min(i + nums[i], n - 1);
            for (int j = i + 1; j <= maxJump; j++) {
                if (dp[j]) {
                    dp[i] = true;
                    break; // No need to check further once reachability is confirmed
                }
            }
        }
        
        return dp[0];
        
    }
}