class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows)
            return s;

        int n = s.length();
        char[][] mat = new char[numRows][n];

        int row = 0, col = 0;
        int idx = 0;

        while (idx < n) {

            // 1️⃣ Go DOWN
            while (row < numRows && idx < n) {
                mat[row][col] = s.charAt(idx);
                row++;
                idx++;
            }

            row -= 2;   // step back to start diagonal
            col++;

            // 2️⃣ Go UP diagonally
            while (row > 0 && idx < n) {
                mat[row][col] = s.charAt(idx);
                row--;
                col++;
                idx++;
            }
        }

        // Read row by row
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != '\0') {
                    ans.append(mat[i][j]);
                }
            }
        }

        return ans.toString();
    }
}
        
