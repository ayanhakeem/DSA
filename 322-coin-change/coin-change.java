import java.util.*;

class Solution {

    public int coinChange(int[] coins, int amount) {

        int n = coins.length;
        int INF = (int) 1e9;

        int[] prev = new int[amount + 1];

        // Base case: idx = 0
        for (int target = 0; target <= amount; target++) {
            if (target % coins[0] == 0) {
                prev[target] = target / coins[0];
            } else {
                prev[target] = INF;
            }
        }

        // For remaining coins
        for (int idx = 1; idx < n; idx++) {

            int[] curr = new int[amount + 1];

            for (int target = 0; target <= amount; target++) {

                // NOT PICK → previous row
                int notPick = prev[target];

                // PICK → current row
                int pick = INF;

                if (coins[idx] <= target) {
                    pick = 1 + curr[target - coins[idx]];
                }

                curr[target] = Math.min(pick, notPick);
            }

            // Move current row to previous row
            prev = curr;
        }

        return prev[amount] >= INF ? -1 : prev[amount];
    }
}