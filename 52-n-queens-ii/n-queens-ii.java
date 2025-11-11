import java.util.*;

class Solution {
    static int solve(int col, char[][] board, int leftRow[], int lowerDiagonal[], int upperDiagonal[]) {
        int n = board.length;
        if (col == n) {
            return 1; // sol found
        }

        int cnt = 0;
        for (int row = 0; row < n; row++) {
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[n - 1 + col - row] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[n - 1 + col - row] = 1;//mark visited in hash array

                cnt += solve(col + 1, board, leftRow, lowerDiagonal, upperDiagonal);

                // backtrack
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n - 1 + col - row] = 0;
            }
        }
        return cnt;
    }

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');

        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2 * n - 1];
        int lowerDiagonal[] = new int[2 * n - 1];

        return solve(0, board, leftRow, lowerDiagonal, upperDiagonal);
    }
}
