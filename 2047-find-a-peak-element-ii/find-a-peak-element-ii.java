class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int low = 0;
        int high = rows - 1;
 
        while (low < high) {
            // Pick the middle row of the current search space.
            int mid = low + (high - low) / 2;
 
            // This stores the column of the largest value in the middle row.
            int bestCol = 0;
            for (int col = 1; col < cols; col++) {
                // Keep the column where the current row has its maximum value.
                if (mat[mid][col] > mat[mid][bestCol]) {
                    bestCol = col;
                }
            }
 
            // Move upward if the current row already beats the row below here.
            if (mat[mid][bestCol] > mat[mid + 1][bestCol]) {
                high = mid;
            } else {
                // Move downward because a larger value exists below in this column.
                low = mid + 1;
            }
        }
 
        // Find the largest element again in the final answer row.
        int bestCol = 0;
        for (int col = 1; col < cols; col++) {
            // Keep the column where the final row has its maximum value.
            if (mat[low][col] > mat[low][bestCol]) {
                bestCol = col;
            }
        }
 
        return new int[]{low, bestCol};
    }
}
 