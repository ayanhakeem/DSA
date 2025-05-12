class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] prefix = new int[n + 1];

        // Step 1: Build prefix sum
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }

        int minSum = Integer.MAX_VALUE;
        boolean found = false;

        // Step 2: Try all subarrays of size l to r
        for (int size = l; size <= r; size++) {
            for (int i = 0; i <= n - size; i++) {
                int sum = prefix[i + size] - prefix[i];
                if (sum > 0) {
                    found = true;
                    minSum = Math.min(minSum, sum);
                }
            }
        }

        return found ? minSum : -1;
    }
}

