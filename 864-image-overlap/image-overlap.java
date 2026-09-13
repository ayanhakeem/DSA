class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {

        int n = img1.length;
        int ans = 0;

        // Try every possible row shift
        for (int dr = -(n - 1); dr <= n - 1; dr++) {

            // Try every possible column shift
            for (int dc = -(n - 1); dc <= n - 1; dc++) {

                int count = 0;

                // Check every position of img1
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        if (img1[i][j] == 1) {

                            // New position after shifting
                            int newRow = i + dr;
                            int newCol = j + dc;

                            // Check if still inside matrix
                            if (newRow >= 0 && newRow < n &&
                                newCol >= 0 && newCol < n) {

                                // Check overlap
                                if (img2[newRow][newCol] == 1) {
                                    count++;
                                }
                            }
                        }
                    }
                }

                // Keep maximum overlap
                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}