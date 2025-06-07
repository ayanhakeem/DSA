class Solution {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;  // A value greater than any possible min count
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);  // Fill with a large value
        dp[0] = 0;  // Base case: 0 coins needed to make amount 0

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[amount] == max ? -1 : dp[amount];
    }
}
