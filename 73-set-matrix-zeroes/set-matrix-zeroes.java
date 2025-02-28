//set matrix zeroes
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;          // Number of rows
        int n = matrix[0].length;       // Number of columns
        boolean rowZero = false;        // Flag to check if the first row needs to be zeroed
        boolean colZero = false;        // Flag to check if the first column needs to be zeroed
        
        // Step 1: Check if the first row and first column need to be zeroed
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                colZero = true; // Mark the first column as needing zeroing
                break;
            }
        }
        
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                rowZero = true; // Mark the first row as needing zeroing
                break;
            }
        }

        // Step 2: Use the first row and first column to mark zeros for other rows and columns
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // Mark the first column of this row
                    matrix[0][j] = 0; // Mark the first row of this column
                }
            }
        }

        // Step 3: Set the matrix elements to zero based on the markers in the first row and first column
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 4: Handle the first row separately
        if (rowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 5: Handle the first column separately
        if (colZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
