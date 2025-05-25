class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] LIS = new int[n];
        int[] LDS = new int[n];

        // Initialize LIS and LDS arrays to 1
        Arrays.fill(LIS, 1);
        Arrays.fill(LDS, 1);

        // Compute LIS for each position
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    LIS[i] = Math.max(LIS[i], LIS[j] + 1);
                }
            }
        }

        // Compute LDS for each position
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    LDS[i] = Math.max(LDS[i], LDS[j] + 1);
                }
            }
        }

        // Calculate minimum removals needed
        int minRemovals = n;
        for (int i = 0; i < n; i++) {
            if (LIS[i] > 1 && LDS[i] > 1) {
                minRemovals = Math.min(minRemovals, n - LIS[i] - LDS[i] + 1);
            }
        }

        return minRemovals;
    }
}
