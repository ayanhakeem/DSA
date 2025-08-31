//tc=o(9^n*n)
//sc=o(1)

import java.util.*;

class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {//found empty
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;

                            if (solve(board)) {//recursion 
                                return true;
                            } else {
                                board[i][j] = '.'; // Backtrack
                            }
                        }
                    }
                    return false; // No valid number found not able to place c
                }
            }
        }
        return true; // Board is completely filled
    }

    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {//0-9
            if (board[i][col] == c) return false; // Check column
            if (board[row][i] == c) return false; // Check row
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false; // Check 3x3 box
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}