class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

    
        int prev[]=new int[amount+1];
        int curr[]=new int[amount+1];

        // Initialize the dp array for the first element of the array
        for (int i = 0; i <= amount; i++) {
            if (i % coins[0] == 0)//handle for 0th idx
                prev[i] = i / coins[0];
            else
                prev[i] = (int) Math.pow(10, 9);
        }

        // Fill the dp array using dynamic programming
        for (int ind = 1; ind < n; ind++) {
            for (int target = 0; target <= amount; target++) {
                int notTake = 0 + prev[target];
                int take = (int) Math.pow(10, 9);

                // If the current element is less than or equal to the target, calculate 'take'
                if (coins[ind] <= target)
                    take = 1 +curr[target - coins[ind]];

                // Store the minimum result in the dp array
                curr[target] = Math.min(notTake, take);
            }
            prev = curr.clone();
        }

        // Get the minimum number of elements needed for the target sum
        int ans = prev[amount];

        // If it's not possible to achieve the target sum, return -1
        if (ans >= (int) Math.pow(10, 9))
            return -1;
        return ans;
    }
}
