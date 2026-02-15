class Solution {
    public long rob(int[] nums, int[] colors) {
        int n = nums.length;
        if (n == 1) return nums[0];

        long[] dp = new long[n];
        dp[0] = nums[0];

        for (int i = 1; i < n; i++) {
            if (colors[i] != colors[i - 1]) {
                // Adjacent allowed
                dp[i] = dp[i - 1] + nums[i];
            } else {
                // Adjacent not allowed
                long take = nums[i] + (i >= 2 ? dp[i - 2] : 0);
                dp[i] = Math.max(dp[i - 1], take);
            }
        }

        return dp[n - 1];
    }
}
