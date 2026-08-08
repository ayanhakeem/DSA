class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {

        int n = nums.length;

        int[] e = new int[n + 1];
        int[] o = new int[n + 1];

        // Build prefix arrays
        for (int i = 0; i < n; i++) {

            e[i + 1] = e[i];
            o[i + 1] = o[i];

            if (nums[i] % 2 == 0) {
                e[i + 1]++;
            } else {
                o[i + 1]++;
            }
        }

        int cnt = 0;

        // Generate every subarray [l...r]
        for (int l = 0; l < n; l++) {

            for (int r = l; r < n; r++) {

                // Number of even elements in [l...r]
                int x = e[r + 1] - e[l];

                // Number of odd elements in [l...r]
                int y = o[r + 1] - o[l];

                // No odd elements
                if (y == 0) {
                    continue;
                }

                // x / y <= a / b
                // Avoid division:
                // b * x <= a * y
                if ((long) b * x <= (long) a * y) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}